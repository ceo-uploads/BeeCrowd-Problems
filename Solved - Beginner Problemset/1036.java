import java.io.IOException;
import java.util.Scanner;
// Problem 1036 - Bhaskara's Formula...
// SUBMISSION # 41242690...
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
         Scanner scanner = new Scanner(System.in);

        // Read the values of A, B, and C
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        // Calculate the discriminant (Delta)
        double delta = B * B - 4 * A * C;

        // Check if it's possible to calculate the roots
        if (A == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            // Calculate the roots using the quadratic formula
            double R1 = (-B + Math.sqrt(delta)) / (2 * A);
            double R2 = (-B - Math.sqrt(delta)) / (2 * A);

            // Print the roots with 5 digits after the decimal point
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
 
    }
    }
 
}