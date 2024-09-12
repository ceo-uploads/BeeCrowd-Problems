import java.io.IOException;
import java.util.Scanner;
// Problem 1080 - Highest and Position...
// SUBMISSION # 41421306
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
         
         int val = 0;
         int pos = 0;
         
         for(int i = 1; i <= 100; ++i) {
             int a = input.nextInt();
             
             if (a > val) {
                 val = a;
                 pos = i;
             }
         }
         
         System.out.println(val);
         System.out.println(pos);
 
    }
 
}