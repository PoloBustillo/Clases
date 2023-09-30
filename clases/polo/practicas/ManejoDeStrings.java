package clases.polo.practicas;

public class ManejoDeStrings {
    //crear un email a partir del nombre y apellido de una persona separados por un . y despues @gmail.com
    //nombre.apellido@gmail.com
    public static void main(String[] args) {
        String nombre = "Juanito".toLowerCase();
        String apellido = "Perez".toLowerCase();
        String dominio = "@gmail.com";

        //! + se comporta como si fuera una concatenación = a un String le voy a añadir el otro inmediatamente
        //? UN STRING SE REPRESENTA CON COMILLAS DOBLES "palabra", UN SOLO CARACTER CON SIMPLES 'o'
        System.out.println(nombre + "." + apellido + dominio);
    }
}
