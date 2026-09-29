import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Llenar un arreglo con números aleatorios
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el tamaño de arreglo que desees: ");
        int tam = sc.nextInt();
        int[] arreglo = new int[tam];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rd.nextInt(100);
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "] ");
        }
    }
}