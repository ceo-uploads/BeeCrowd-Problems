import java.io.IOException;
import java.util.Scanner; 
// Problem 1071 - Sum of Consecutive Odd Numbers I...
// SUBMISSION # 41419929...
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
        
        int na = input.nextInt();
        int nb = input.nextInt();
        int sum = 0;
        
        if (nb > na) {
            int a = na + 1;
            int b = nb - 1;
            
            for (int i = a; i <= b; i ++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        } else if (na > nb) {
            int a = na - 1;
            int b = nb + 1;
            
            for (int i = b; i <= a; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        }
        
        System.out.println(sum);
 
    }
 
}