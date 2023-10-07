package clases.polo.clase2;

public class DatosPrimitivos {

    public static void main(String[] args) {
        System.out.println(args);
        //! Memoria vs Espacio
        String string = "kskdkasd";

        //*ENTEROS - NATURALES:
        int aInt = 10;
        int bInt;
        int cInt, dInt;
        //*DOUBLE VS FLOAT
        double aDouble;
        double bDouble, cDouble, dDouble;
        float aFloat, bFloat;
        //*BOOLEAN
        boolean aBoolean, bBoolean;
        //false o true


        //todo PRACTICAS - ASIGNACIÓN - CAST
        aInt = 10;
        aDouble = 10.812384218312;


        //? MEMORIA ES MENOR AL TAMAÑO DEL DATO
        int numeroX = (int) aDouble;
        System.out.println(numeroX);

        //? MEMORIA ES MAYOR AL TAMAÑO DEL DATO
        double numeroY = aInt;
        System.out.println(numeroY);

        //? DATOS INCOMPATIBLES
        //*Booleanos a Enteros


        //! STRING NO ES DATO PRIMITIVO
        System.out.println(string.getClass());

    }

}
