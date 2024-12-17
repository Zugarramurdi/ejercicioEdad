/*Pequeño programa que solicita un nombre y una edad para verificar si puede votar o no
    Con verificacion de caracteres en nombre y edad numerica
    Autor: Juanma Segura - DAM
 */
import java.util.Scanner;
public class EdadVotar {
    //Declaro la edad minima para votar como constante
    private static int edadVotar = 18;
    public static void main(String[] args) {

        //declaramos las variables a utilizar: nombre, edad y esNumero para verificar si la edad es numerica.
        int edad = 0;
        String nombre = "";
        boolean esNumero = false;

        //Instanciamos Scanner
        Scanner sc = new Scanner(System.in);

        //Creamos un bucle para verificar que el nombre es correcto
        do {
            System.out.println("Ingrese su nombre: ");
            nombre = sc.nextLine();

            //Con la expresion:!nombre.matches("[a-zA-Z ]+)]") Verificamos que el nombre solo tenga letras y espacios y el bucle se repetira si no es correcto.
            if (!nombre.matches("[a-zA-Z ]+")) {
                System.out.println("Nombre no valido, intente de nuevo");
            }
        } while (!nombre.matches("[a-zA-Z ]+"));

        do {
            System.out.println("Ingrese su edad: ");

            //con hasNextInt verificamos que la edad solo sea numerica, de lo contrario se repetira el bucle indicando que debe ser un valor numerico.
            if (sc.hasNextInt()) {
                edad = sc.nextInt();
                esNumero = true;  //Si la edad es numerica, esNumero es true u se verifica si es mayor de edad o no, devolviendo un mensaje con el nombre y si puede votar o no.
                if (edad >= edadVotar) {
                    System.out.println("Hola " + nombre + ", puedes votar :)");
                } else {
                    System.out.println("Hola " + nombre + ", no puedes votar :(");
                }
            }else{
                System.out.println("Edad no valida, tiene que ser numerica, intente de nuevo");
                sc.next();
            }
        }while (esNumero == false);

        sc.close();
    }

}
