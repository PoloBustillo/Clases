package clases.polo.clase2;

public class EstructuraDesicion {
    public static void main(String[] args) {
        //IF - ELSE

        //FORMATO if-si
        /*
        if( condición  - true o false ){
            si es true ejecuto este bloque
        }
        */
        int cinco = 5;
        int diez = 10;
        int uno = 1;
        if (cinco < uno || uno < diez) {
            System.out.println("+++++++++++++++");
            System.out.println("5 ES MAYOR");
            System.out.println("--------------");
        } else if (cinco > diez) {
            System.out.println("+++++++++++++++");
            System.out.println("5 ES MENOR");
            System.out.println("ESTOY EN ELSE");
        } else if (uno > diez) {
            System.out.println("ESTOY EN ELSE");
        }

    }
}
