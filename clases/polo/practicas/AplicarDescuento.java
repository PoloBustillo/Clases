package clases.polo.practicas;

public class AplicarDescuento {

    public static void main(String[] args) {
        double valorProducto = 301.3;
        double porcentaje = .2;

        if (valorProducto >= 200) {
            System.out.println(valorProducto - valorProducto * porcentaje);
        } else {
            System.out.println(valorProducto);
        }
    }

}
