import java.io.IOException;
import java.util.Scanner;
// Problem 1067 - Odd Numbers...
// SUBMISSION # 41363514...
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
         
         for (int i = 1; i <= a; i++) {
             if (i % 2 != 0) {
                 System.out.println(i);
             }
         }
 
    }
 
}