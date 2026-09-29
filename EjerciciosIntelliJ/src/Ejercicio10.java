import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        // Determinar número mayor, menor, suma y promedio de un arreglo

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

        // DETERMINAR NÚMERO MAYOR
        int numMayor = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > numMayor) {
                numMayor = arreglo[i];
            }
        }
        System.out.println("");
        System.out.println("El número mayor es: " + numMayor);

        // DETERMINAR NÚMERO MENOR
        int numMenor = 10000000;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < numMenor) {
                numMenor = arreglo[i];
            }
        }
        System.out.println("El número menor es: " + numMenor);

        // SUMA Y PROMEDIO
        int suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        System.out.println("La suma del arreglo: " + suma);
        double promedio = (double) suma / arreglo.length;
        System.out.println("El promedio del arreglo: " + promedio);
    }
}