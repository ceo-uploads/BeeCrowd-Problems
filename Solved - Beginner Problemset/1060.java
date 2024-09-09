import java.io.IOException;
import java.util.Scanner;
// Problem 1060 - Positive Numbers...
// SUBMISSION # 41342087...
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
         double[] num = new double[6];
         int count = 0;
         
         for (int i = 0; i < 6; ++i) {
             num[i] = input.nextDouble();
             if (num[i] >= 0) {
                 count++;
             }
         }
         
         System.out.println(count+" valores positivos");
 
    }
 
}