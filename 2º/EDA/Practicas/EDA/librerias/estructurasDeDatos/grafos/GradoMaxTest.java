package librerias.estructurasDeDatos.grafos;

import librerias.estructurasDeDatos.modelos.ListaConPI;

public class GradoMaxTest {
     public static void main(final String[] args) {
        String res = testExamen1();
        if (res == null)
            System.out.println("TEST PASSED SUCCESSFULLY\n");
        else
            System.out.println("THERE IS AN ERROR: " + res);
    }

    private static String testExamen1() {
        GrafoNoDirigido g;
        int vertice;
        int[][] a;

        // Test 1
        g = new GrafoNoDirigido(7);
        g.insertarArista(2, 3, 4.0);
        g.insertarArista(4, 5, 4.0);
        g.insertarArista(0, 1, 6.0);
        g.insertarArista(1, 3, 6.0);
        g.insertarArista(3, 4, 9.0);
        g.insertarArista(0, 2, 12.0);
        g.insertarArista(2, 4, 12.0);
        g.insertarArista(3, 5, 12.0);
        g.insertarArista(0, 3, 14.0);
        g.insertarArista(5, 6, 15.0);
        g.insertarArista(1, 5, 20.0);
        g.insertarArista(4, 6, 20.0);
        vertice = g.verticeMayorGrado();
        if (vertice != 3)
            return "Incorrect value returned, wanted 3 but got " + vertice;

        // Test 2
        g = new GrafoNoDirigido(5);
        a = new int[][] {{0, 1, 1}, {1, 2, 2}, {1, 4, 3}, {0, 3, 4}, {3, 4, 5}};
        for (int b[] : a) g.insertarArista(b[0], b[1], b[2]);
        vertice = g.verticeMayorGrado();
        if (vertice != 1)
            return "Incorrect value returned, wanted 1 but got " + vertice;

        // Test 3
        g = new GrafoNoDirigido(5);
        a = new int[][] {{0, 1, 1}, {1, 2, 2}, {1, 4, 3}, {0, 3, 4}, {3, 4, 5}, {1, 3, 1}};
        for (int b[] : a) g.insertarArista(b[0], b[1], b[2]);
        vertice = g.verticeMayorGrado();
        if (vertice != 1)
            return "Incorrect value returned, wanted 1 but got " + vertice;

        // Test 4
        g = new GrafoNoDirigido(6);
        a = new int[][] {{0, 5, 5}, {5, 1, 1}, {5, 2, 2}, {1, 2, 4}, {2, 3, 5}, {5, 3, 2}, {3, 4, 4}, {4, 5, 1}};
        for (int b[] : a) g.insertarArista(b[0], b[1], b[2]);
        vertice = g.verticeMayorGrado();
        if (vertice != 5)
            return "Incorrect value returned, wanted 5 but got " + vertice;

        // All ok
        return null;
    }
}