import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero = 0;
        // numero = (int) (Math.random() * 100); -> Forma 1
        Random rd = new Random();
        numero = rd.nextInt(100); // El número de adentro es el rango, en este caso 1-100
        System.out.println("Número random: " + numero);
    }
}