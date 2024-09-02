import java.io.IOException;
import java.util.Scanner;
// Problem 1013 - The Greatest
// SUBMISSION # 41197046...
 
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

        // Read the three integer values
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Use a formula to determine the greatest of the three values
        int greatestAB = (a + b + Math.abs(a - b)) / 2; // Greatest between a and b
        int greatest = (greatestAB + c + Math.abs(greatestAB - c)) / 2; // Greatest among a, b, and c

        // Print the greatest value followed by "eh o maior"
        System.out.println(greatest + " eh o maior");
    }
 
}