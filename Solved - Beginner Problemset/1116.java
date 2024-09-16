import java.io.IOException;
import java.util.Scanner;
// Problem 1116 - Dividing X by Y...
// SUBMISSION # 41493714...
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
        
        for (int i = 0; i < n; i++) {
            double x = input.nextInt();
            double y = input.nextInt();
            
            if (y != 0) {
                double div = x/y;
                System.out.printf("%.1f%n", div);
            } else {
                System.out.println("divisao impossivel");
            }
        }
 
    }
 
}