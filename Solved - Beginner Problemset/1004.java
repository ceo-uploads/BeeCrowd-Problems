import java.io.IOException;
import java.util.Scanner;
// problem 2004 - simple product...

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
         
         System.out.println("PROD = " +(a * b));
 
    }
 
}