class Comptador {
  private long valor= 0;
  public synchronized void incrementa() {
    long aux;
    aux= valor;
    aux++;
    valor= aux;
  }
  public synchronized long getValor() {
    return valor;
  }
}

class Contable extends Thread {
  Comptador comptador;
  public Contable(Comptador c) {
    comptador= c;
  }
  public void run() {
    int i;
    long aux;
    for (i= 1; i <= 10000000; i++) {
      comptador.incrementa();
    }
    System.out.println ("c= "+comptador.getValor());
  }
}

class FilsSync {
  public static void main (String args[]) {
    Contable c1, c2;
    Comptador c= new Comptador();
    c1= new Contable(c);
    c2= new Contable(c);
    c1.start();
    c2.start();
  }
}
