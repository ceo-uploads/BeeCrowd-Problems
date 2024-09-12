import java.io.IOException;
// Problem 1095 - Sequence IJ 1...
// SUBMISSION # 41421439...
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
         int I = 1;
        int J = 60;
        
        // Loop until J becomes 0
        while (J >= 0) {
            // Print the current values of I and J
            System.out.println("I=" + I + " J=" + J);
            
            // Increase I by 3 and decrease J by 5
            I += 3;
            J -= 5;
        }
 
    }
 
}