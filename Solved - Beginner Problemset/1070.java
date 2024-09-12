import java.io.IOException;
import java.util.Scanner;
// Problem 1070 - Six Odd Numbers...
// SUBMISSION # 41363766... 
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
         
         int a = input.nextInt();
         int count = 0;
         
         do {
             if (a % 2 != 0) {
                 System.out.println(a);
                 count++;
             }
             a++;
         } while (count < 6);
         
 
    }
 
}