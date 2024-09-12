import java.io.IOException;
import java.util.Scanner; 
// Problem 1072 - Interval 2...
// SUBMISSION # 41419981...
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
         int inCount = 0;
         int outCount = 0;
         
         for (int i = 0; i < n; i++) {
             int num = input.nextInt();
             
             if (num >= 10 && num <= 20) {
                 inCount++;
             } else {
                 outCount++;
             }
         }
         
         System.out.println(inCount+ " in");
         System.out.println(outCount+" out");
 
    }
 
}