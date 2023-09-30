package clases.polo.clase3;

public class UseOfWhile {

    //*operador de control while (MIENTRAS una condición se cumple va a ejecutar un bloque de codigo)
    //?loop-ciclo: la repetición de un mismo bloque del programa
    public static void main(String[] args) {
        boolean flag = true;
        int counter = 0;


        // uso de booleano como condicion de parada
        while (flag) {
            //!SIEMPRE TENER UNA CONDICION DE PARADA
            System.out.println("BLOQUE while con flag");
            if (11 > 10) {
                System.out.println("condicion de parada");
                flag = false;
            }
        }

        // uso de contador como condicion de parada
        while (counter < 10) {
            //!SIEMPRE TENER UNA CONDICION DE PARADA
            System.out.println("BLOQUE while con contador");
            counter++;
        }

        // uso de contador y flag como condicion de parada

        while (counter < 10) {
            //!SIEMPRE TENER UNA CONDICION DE PARADA
            System.out.println("BLOQUE while con contador/flag");
            //if (flag)
            counter++;
        }

        System.out.println("TERMINO TU WHILE");
    }


}
