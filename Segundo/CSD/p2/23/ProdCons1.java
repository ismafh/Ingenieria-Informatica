class Caixa {
  private int valor;
  public synchronized void clavar(int nv) {
    valor= nv ;
    System.out.print("Clavat el "+valor);
  }
  public synchronized void treure() {
    System.out.println(" i tret el "+valor);
    valor= 0;
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

class ProdCons1 {
  public static void main(String args []) {
    Caixa x= new Caixa();
    Productor p= new Productor(x);
    Consumidor c= new Consumidor(x);
    p.start();
    c.start();
  }
}
