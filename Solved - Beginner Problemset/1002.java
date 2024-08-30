import java.io.IOException;
import java.util.Scanner;

// problem - 1002 Area of a Circle
// SUBMISSION # 41175121
 
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
         final double PI = 3.14159; // Define PI as a constant

        Scanner scanner = new Scanner(System.in);

        // Input: Read the radius R as a double
        double R = scanner.nextDouble();

        // Calculation: Calculate the area A = PI * R^2
        double area = PI * R * R;

        // Output: Print the result with 4 decimal places, followed by a newline
        System.out.printf("A=%.4f%n", area);
 
    }
 
}