import java.io.IOException;
import java.util.Scanner;
// Problem 1074 - Even or Odd...
// SUBMISSION # 41420080...
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
          Scanner input = new Scanner(System.in);
         
         int n = input.nextInt();
         int[] numbers = new int[n];
         
         for (int j = 0; j < n; j++) {
             numbers[j] = input.nextInt();
         }
         
         for (int i : numbers) {
                  if (i % 2 == 0 && i > 0) {
                 System.out.println("EVEN POSITIVE");
             } else if (i % 2 == 0 && i < 0) {
                 System.out.println("EVEN NEGATIVE");
             } else if (i == 0) {
                 System.out.println("NULL");
             } else if (i % 2 != 0 && i > 0) {
                 System.out.println("ODD POSITIVE");
             } else if (i % 2 != 0 && i < 0) {
                 System.out.println("ODD NEGATIVE");
             }
        }
 
    }
 
}