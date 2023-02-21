package p3;
public class MinHeap<E extends Comparable<E>>{
    protected E[] elVector = null;
    protected int talla = 0;


    public MinHeap(E[] elementos){
        talla = elementos.length;
        elVector = (E[]) new Comparable[talla+1];
        for(int i=0; i<elementos.length; i++) elVector[i+1]=elementos[i];
        buildheap();
    }

    private void heapify(int pos){
        int hizq, hder, mayor;
        hizq = 2*pos;
        hder = 2*pos+1;
        mayor = pos;
        if (hizq <= talla && elVector[hizq].compareTo(elVector[mayor]) > 0)
        mayor = hizq;
        if (hder <= talla && elVector[hder].compareTo(elVector[mayor]) > 0)
        mayor = hder;
        if (mayor != pos) {
            E aux = elVector[pos];
            elVector[pos] = elVector[mayor];
            elVector[mayor] = aux;
            heapify(mayor);
        }
    }

    public void heapsort(){
        buildheap();
        for (int i = talla; i > 1; i--) {
        E aux = elVector[i];
        elVector[i] = elVector[1];
        elVector[1] = aux;
        talla--;
        heapify(1);
 }

    }

    public void buildheap(){
        for (int i = talla/2; i > 0; i--) {
            heapify(i);
        }
           
    }

    public void insertar(E x){
        elVector[++talla] = x;
        int i = talla;
        while (i > 1 && elVector[i/2].compareTo(x) < 0) {
        elVector[i] = elVector[i/2];
        i = i/2;
        }
        elVector[i] = x;
    }

    public E minimo(){
        return elVector[1];
    }

    public E eliminarMin(){
        E min = elVector[1];
        elVector[1] = elVector[talla--];
        heapify(1);
        return min;
    }
}
