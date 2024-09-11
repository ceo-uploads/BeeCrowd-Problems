import java.io.IOException;
import java.util.Scanner; 
// Problem 1065 - Even Between five Numbers...
// SUBMISSION # 41357164...
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
         int b = input.nextInt();
         int c = input.nextInt();
         int d = input.nextInt();
         int e = input.nextInt();
         int count = 0;
         
         int[] arr = {a, b, c, d, e};
         
         for (int num : arr) {
             if (num % 2 == 0) {
                 count++;
             }
         }
         
         System.out.println(count+ " valores pares");
         
         input.close();
 
    }
 
}