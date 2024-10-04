import java.io.IOException;
import java.util.Scanner;
// Problem 1143 - Squared and Cubic.
 
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
         Scanner sc = new Scanner(System.in);

        // Read the integer N
        int N = sc.nextInt();

        // Ensure N is within the valid range
        if (N > 1 && N < 1000) {
            // Loop to print each line with number, square, and cube
            for (int i = 1; i <= N; i++) {
                int square = i * i;
                int cube = i * i * i;
                System.out.println(i + " " + square + " " + cube);
            }
        }

        sc.close();
 
    }
 
}