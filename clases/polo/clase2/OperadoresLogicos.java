package clases.polo.clase2;

public class OperadoresLogicos {

    //? PUNTO DE ENTRADA DEL PROGRAMA
    public static void main(String[] args) {


        //proposiciones VERDADERO,FALSO : el cielo es verde = true
        //*IGUALDAD ==
        //? 10 == 5 FALSO
        //? 10 == 10 VERDADERO
        //? numero1 == numero2 DEPENDER DE SUS VALORES
        System.out.println(10 == 10);  //true
        System.out.println(10 == 1);   //false
        //*DESIGUALDAD !=
        System.out.println(10 != 10);  //false
        System.out.println(10 != 1);   //true

        //*MAYOR Y MENOR QUE < >
        int numeroUno = 10;
        double numeroDos = 5.34;
        System.out.println(numeroUno < numeroDos);
        boolean verdadero = true;
        boolean falso = false;
        System.out.println(falso == verdadero);
        System.out.println(5 > 0);
        System.out.println(5 < 0);
        //*MAYOR O IGUAL Y MENOR O IGUAL QUE <= >=
        System.out.println(5 >= 5);
        System.out.println(5 <= 0);

        //*NEGACIÓN UNITARIA !
        System.out.println(falso == !verdadero);
        //false =>! true =>! false

        //* AND, OR: && ||
        //System.out.println((10 < 20) && (5 > 21));
        //El cielo es azul (y) me llamo Elias => false
        //tanto la primera parte como la segunda sean true
        boolean elCieloAzul = false;
        boolean meLlamoPepe = false;
        System.out.println("OR: " + (elCieloAzul || meLlamoPepe));
        //El cielo es azul (o) me llamo Elias => false
        //la primera parte o la segunda sean true

    }

}
