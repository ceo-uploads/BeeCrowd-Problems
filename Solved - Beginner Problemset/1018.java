import java.io.IOException;
import java.util.Scanner; 
// Problem 1018 - Banknotes...
// SUBMISSION # 41209152
// 
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

        // Read the integer input value
        int N = scanner.nextInt();
        System.out.println(N);

        // List of available banknotes
        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};

        // Decompose the value
        for (int note : banknotes) {
            int count = N / note;  // Number of banknotes of this denomination
            N = N % note;  // Remaining amount after using these banknotes
            System.out.println(count + " nota(s) de R$ " + note + ",00");
        }

        scanner.close();
 
    }
 
}