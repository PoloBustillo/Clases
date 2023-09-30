package clases.polo.clase2;

public class OperadoresAritmeticos {

    //? PUNTO DE ENTRADA DEL PROGRAMA
    public static void main(String[] args) {

        //*ASIGNACIÓN =
        boolean elCieloEsAzul = false;
        //*SUMAR DOS NÚMEROS NATURALES: +
        int numeroUno = 10;
        int numeroDos = 11;
        System.out.println(numeroUno + numeroDos);
        //*MULTIPLICAR TRES NÚMEROS REALES (double vs float): *
        //*DIVIDIR DOS ENTROS: /
        //*MODULO DE UN NUMERO: %

        //*INCREMENTO UNITARIO: ++
        int contador = 0;
        System.out.println(++contador);
        //*DECREMENTO UNITARIO: --

        //!CASOS ESPECIALES += -=

        int numeroX = 10;

        numeroX *= 123;   // numero = numero * 123;
        System.out.println(numeroX);

        //!Libreria MATH
        System.out.println(Math.pow(2, 10));


    }

}
