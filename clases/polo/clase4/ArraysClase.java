package clases.polo.clase4;

import java.util.Arrays;

public class ArraysClase {
    public static void main(String[] args) {

        /*
        tipo_dato[] nombre_array;
        nombre_array = new tipo_dato[tamaño];
         */


        String[] arrayEnteros; //* GUARDAR UNA POSICION EN MEMORIA
        arrayEnteros = new String[3]; //* ASIGNANDO UN TAMAÑO


        int[] arrayEnteros2 = new int[10]; //0-9 son 10 posiciones
        arrayEnteros2[0] = 16;
        arrayEnteros2[1] = 20;


        String[] filaUnoDeGato = {"---", "---", " O "};


        System.out.println(filaUnoDeGato[2]);

        filaUnoDeGato[0] = " X ";

        //System.out.println(Arrays.toString(filaUnoDeGato));

        String[] filaDeGato = {"---", "---", " O "};
        String[] filaDosDeGato = {"---", "---", " O "};
        String[] filaTresDeGato = {"---", "---", " O "};

        String[][] gatoTablero = {{"---", "---", " O "}, {"---", "---", " O "}, {"---", "---", " O "}};
        int counter = 0;
        while (counter < 3) {
            System.out.println(Arrays.toString(gatoTablero[counter]));
            counter++;
        }

        //obtener nombres de 2 jugadores
        //limpiar tablero
        //lanzar moneda


    }
}
