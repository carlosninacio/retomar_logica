import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = -1;
        int num = 0;

        while (opc!=2){
            System.out.print("\nIngrese un número: ");
            num = sc.nextInt();
            System.out.println("El número ingresado es: " + num);

            System.out.print("\n¿Desea continuar? (1 = Sí / 2 = No)? ");
            opc = sc.nextInt();
        }
    }
}