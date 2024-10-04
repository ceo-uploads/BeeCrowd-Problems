import java.io.IOException;
import java.util.Scanner;
// Problem 2006 - Identifying Tea...
// SUBMISSION # 41474962...
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
         int count = 0;
         int a = input.nextInt();
         
         int[] tea = new int[5];
         
         for (int i = 0; i < 5; i++) {
             tea[i] = input.nextInt();
         }
         
         for (int arr : tea) {
             if (arr == a) {
                 count++;
             }
         }
         
         System.out.println(count);
 
    }
 
}