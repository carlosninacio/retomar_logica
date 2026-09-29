import java.util.Scanner;

public class Ejercicio5 {
    // Determinar si un número es impar o par
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número que desea verificar: ");
        int num =  sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número " + num + " es par.");
        } else {
            System.out.println("El número " + num + " no es par.");
        }
    }
}