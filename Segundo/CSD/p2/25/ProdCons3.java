class Caixa {
  private int valor;
  private boolean disponible= false;
  public synchronized void clavar(int nv) {
    if (disponible) {
      try {
        wait();
      } catch (InterruptedException e) {}
    }
    valor= nv ;
    disponible= true;
    System.out.print("Clavat el "+valor);
    notify();
  }
  public synchronized void treure() {
    if (!disponible) {
      try {
        wait();
      } catch (InterruptedException e) {}
    }
    System.out.println(" i tret el "+valor);
    valor= 0;
    disponible= false;
    notify();
  }
}

class Productor extends Thread {
  Caixa c;
  public Productor(Caixa nc) {
    c= nc;
  }
  public void run() {
    int i;
    for (i= 1; i <= 10; i++) c.clavar(i);
  }
}

class Consumidor extends Thread {
  Caixa c;
  public Consumidor(Caixa nc) {
    c= nc;
  }
  public void run() {
    int i;
    for (i= 1; i <= 10; i++) c.treure();
  }
}

class ProdCons3 {
  public static void main(String args []) {
    Caixa x= new Caixa();
    Productor p= new Productor(x);
    Consumidor c= new Consumidor(x);
    p.start();
    c.start();
  }
}
