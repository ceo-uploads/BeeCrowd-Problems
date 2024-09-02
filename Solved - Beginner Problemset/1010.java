import java.io.IOException;
import java.util.Scanner;
// Problem 1010 - Simple Calculate...
// SUBMISSION # 41182935...
 
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
         int code1 = input.nextInt();
         int unit1 = input.nextInt();
         double price1 = input.nextDouble();
         int code2 = input.nextInt();
         int unit2 = input.nextInt();
         double price2 = input.nextDouble();
         
         double total = (unit1 * price1) + (unit2 * price2);
         
         System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
         
 
    }
 
}