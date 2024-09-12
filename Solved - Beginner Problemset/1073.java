import java.io.IOException;
import java.util.Scanner; 
// Problem 1073 - Even Square...
// SUBMISSION # 41420019...
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
         
         for (int i = 1; i <= n; i++) {
             if (i % 2 == 0) {
                 int pow = i * i;
                 System.out.println(i+"^2 = " +pow);
             }
         }
 
    }
 
}