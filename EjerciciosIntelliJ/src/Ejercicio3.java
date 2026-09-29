import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Imprimir tablas de multiplicar
        Scanner sc = new Scanner(System.in);
        int num = 0;

        // Imprimir tabla que el usuario quiera
        System.out.print("Ingrese el número del que desea ver su tabla de multiplicar: ");
        num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println("- [" + num + " * " + i + "] = " + (num*i));
        }

        // Imprimir todas las tablas
        System.out.println("");
        System.out.println("TODAS LAS TABLAS DE MULTIPLICAR:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println("- [" + i + " * " + j + "] = " + (i*j));
            }
            System.out.println("");
        }

    }
}