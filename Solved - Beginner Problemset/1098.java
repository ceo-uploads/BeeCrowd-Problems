import java.io.IOException;
// Problem 1098 - Sequence IJ 4...
// SUBMISSION # 41426197...
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
        System.out.println("I=0 J=1");
        System.out.println("I=0 J=2");
        System.out.println("I=0 J=3");
        
        // Loop through values of I from 0.2 to less than 2.0
        
        for (double i = 0.2; i <= 0.8; i += 0.2) {
            for (double j = 1; j <= 3; ++j) {
                System.out.printf("I=%.1f J=%.1f%n", i, j + i);
            }
        }
        
        System.out.println("I=1 J=2");
        System.out.println("I=1 J=3");
        System.out.println("I=1 J=4");
        
        for (double i = 1.2; i <= 1.8; i += 0.2) {
            for (double j = 1; j <= 3; ++j) {
                System.out.printf("I=%.1f J=%.1f%n", i, j + i);
            }
        }
        
        // Print the final set for I=2
        System.out.println("I=2 J=3");
        System.out.println("I=2 J=4");
        System.out.println("I=2 J=5");
    }
 
}