public Pila<E extends Comparable<E>> metodo1(Pila<E> p,E x){    //p=[3,4,2,5,7,1,2,8] x=4
    if(p.esVacia()) return 0;
    p.incio();
    while(!p.esVacia()){
        E y = p.recuperar();
        if(y.compareTo(x)<0){
        p.eliminar();
        }else p.siguiente()
    }
    return p;
 }