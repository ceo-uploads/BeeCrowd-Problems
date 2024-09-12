import java.io.IOException;
// Problem 1097 - Sequence IJ 3...
// SUBMISSION # 41421549...
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
         for (int I = 1; I <= 9; I += 2) {
            // Set the initial value of J based on the value of I
            int J_start = 7 + (I - 1); // Dynamically set J starting value
            
            // Inner loop for J, iterating three times for each I
            for (int J = J_start; J >= J_start - 2; J--) {
                // Print the current values of I and J
                System.out.println("I=" + I + " J=" + J);
            }
        }
 
    }
 
}