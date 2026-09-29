import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Indicar cantidad de veces que se repite un caracter en una cadena
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cadena: ");
        String cadena = sc.nextLine();

        System.out.print("Ingrese el caracter que deseas contar: ");
        char caracter = sc.next().charAt(0);

        int contador = 0;

        for (int i = 1; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }

        System.out.println("El caracter '" + caracter + "' se repite: " + contador + " veces");

    }
}