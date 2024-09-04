import java.io.IOException;
import java.util.Scanner;
// Problem 1020 - Age in Days...
// SUBMISSION # 41227980...
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
        int in = input.nextInt();
        int[] arr = {365, 30, 1};
        
        for (int conv : arr) {
            int n = in / conv;
            in = in % conv;
            if (conv == 365) {
                System.out.println(n + " ano(s)");
            } else if (conv == 30) {
                System.out.println(n + " mes(es)");
            } else if (conv == 1) {
                System.out.println(n + " dia(s)");
            }  
        }
        
        input.close();
 
    }
 
}