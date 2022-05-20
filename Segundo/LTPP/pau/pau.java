public class pau{

    public static int metodo2(int[] v) {
        int u = v.length - 1;
        if (v[u] == v[0] + u) return v[u] + 1;
        return metodo2(v, 0, u);
        }

    private static int metodo2(int[] v, int i, int f) {
        if (i > f || v[i] != v[0] + i) return v[0] + i;
        int m = (i + f) / 2;
        if (v[m] == v[0] + m) return metodo2(v, m + 1, f);
        else return metodo2(v, i, m - 1);
    }

    public static void main(String[] args){
        int[] a={1,2,4,5,6};
        metodo2(a);
    }
}