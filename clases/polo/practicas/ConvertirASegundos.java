package clases.polo.practicas;

public class ConvertirASegundos {

    public static void main(String[] args) {
        double dias = 10.3;
        double horas = 253.1;


        double minutos = 90;
        if (minutos >= 60) {
          /*   60 -> 1
               74 -> 74/60    */
            System.out.println("HORA(S):");
            System.out.println(minutos / 60);
        } else {
            //dejar como esta
            System.out.println("MINUTOS(S):");
            System.out.println(minutos);
        }


        double minASeg = minutos * 60;
        double horasASeg = horas * 60 * 60;
        double diasASeg = dias * 24 * 60 * 60;

        double sumaTotal = minASeg + horasASeg + diasASeg;
        System.out.println(sumaTotal);

    }
}
