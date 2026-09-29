import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Determinar si es palindromo
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cadena que desea verificar: ");
        String cadena = sc.nextLine();
        String reversa = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            reversa += cadena.charAt(i);
        }
        System.out.println(reversa);
        System.out.println("");

        if (cadena.equalsIgnoreCase(reversa)) {
            System.out.println("Es palindromo");
        } else {
            System.out.println("No es palindromo");
        }
    }
}