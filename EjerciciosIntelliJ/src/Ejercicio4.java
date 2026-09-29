import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Imprimir torre de asteriscos
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número de filas de la torre: ");
        int tam = sc.nextInt();

        for (int altura = 1; altura <= tam; altura++) {

            for (int e = 1; e <= (tam-altura); e++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= (altura*2)-1 ; i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}