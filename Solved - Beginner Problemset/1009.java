import java.io.IOException;
import java.util.Scanner;
// Problem 1009 - Salary with Bonus...
// SUBMISSION # 41182743...
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
         String name = input.nextLine();
         double sl = input.nextDouble();
         double totalSale = input.nextDouble();
         
         double tosl = sl + (totalSale / 100) * 15;
         
         System.out.printf("TOTAL = R$ %.2f%n", tosl);
    }
 
}