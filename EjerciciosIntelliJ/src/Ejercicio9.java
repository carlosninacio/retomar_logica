import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Llenar arreglo desde teclado
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int tam = sc.nextInt();
        int[] arreglo = new int[tam];

        for (int i = 0; i < arreglo.length; i++ ) {
            System.out.print("Ingrese el valor para la posición [" + i + "]: ");
            arreglo[i] = sc.nextInt();
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "] ");
        }
    }
}