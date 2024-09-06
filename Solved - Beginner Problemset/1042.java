import java.io.IOException;
import java.util.Scanner;
// Problem 1042 - Simple Sort...
// SUBMISSION # 41274350...
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
        
        if (a < b && b < c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if (b < a && a < c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if (c < a && a < b) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        } else if (a < c && c < b) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        } else if (b < c && c < a) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else if (c < b && b < a) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
        
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
 
}