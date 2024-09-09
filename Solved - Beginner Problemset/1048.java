import java.io.IOException;
import java.util.Scanner;
// Problem 1048 - Salary Increase...
// SUBMISSION # 41340533...
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
        double a = input.nextDouble();
        if (a >= 0 && a <= 400.00) {
            double total = (a / 100) * 15;
            double sal = a + total;
            System.out.printf("Novo salario: %.2f%n", sal);
            System.out.printf("Reajuste ganho: %.2f%n", total);
            System.out.println("Em percentual: 15 %");
        } else if (a >= 400.01 && a <= 800.00) {
            double total = (a / 100) * 12;
            double sal = a + total;
            System.out.printf("Novo salario: %.2f%n", sal);
            System.out.printf("Reajuste ganho: %.2f%n", total);
            System.out.println("Em percentual: 12 %");
        } else if (a >= 800.01 && a <= 1200.00) {
            double total = (a / 100) * 10;
            double sal = a + total;
            System.out.printf("Novo salario: %.2f%n", sal);
            System.out.printf("Reajuste ganho: %.2f%n", total);
            System.out.println("Em percentual: 10 %");
        } else if (a >= 1200.01 && a <= 2000.00) {
            double total = (a / 100) * 7;
            double sal = a + total;
            System.out.printf("Novo salario: %.2f%n", sal);
            System.out.printf("Reajuste ganho: %.2f%n", total);
            System.out.println("Em percentual: 7 %");
        } else if ( a > 2000.00) {
            double total = (a / 100) * 4;
            double sal = a + total;
            System.out.printf("Novo salario: %.2f%n", sal);
            System.out.printf("Reajuste ganho: %.2f%n", total);
            System.out.println("Em percentual: 4 %");
        }
 
    }
 
}