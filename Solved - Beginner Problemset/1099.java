import java.io.IOException;
import java.util.Scanner;
// Problem 1099 - Sum of Consecutive Odd Numbers II...
// SUBMISSION # 41475035...
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
        
        for (int i = 0; i < n; ++i) {
            int na = input.nextInt();
            int nb = input.nextInt();
            
            if (nb > na) {
                int sum = 0;
                int a = na + 1;
                int b = nb - 1;
                
                for (int j = a; j <= b; j++) {
                    if (j % 2 != 0) {
                        sum += j;
                    }
                }
                
                System.out.println(sum);
            } else if (na > nb) {
                int sum = 0;
                int a = na - 1;
                int b = nb + 1;
                
                for(int j = a; j >= b; j--) {
                    if (j % 2 != 0) {
                        sum += j;
                    }
                }
                
                System.out.println(sum);
            } else if (na == nb) {
                System.out.println("0");
            }
        }
 
    }
 
}