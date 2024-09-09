import java.io.IOException;
import java.util.Scanner;
// Problem 1051 - Taxes...
// SUBMISSION # 41341896...
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        // Read the input salary
        double salary = input.nextDouble();
        double tax = 0.0;

        // Tax calculation based on salary ranges
        if (salary <= 2000.00) {
            System.out.println("Isento");  // No tax if salary is less than or equal to 2000
        } else {
            if (salary > 2000.00 && salary <= 3000.00) {
                tax += (salary - 2000.00) * 0.08;
            } else if (salary > 3000.00 && salary <= 4500.00) {
                tax += (1000.00 * 0.08);  // First 1000 taxed at 8%
                tax += (salary - 3000.00) * 0.18;
            } else if (salary > 4500.00) {
                tax += (1000.00 * 0.08);  // First 1000 taxed at 8%
                tax += (1500.00 * 0.18);  // Next 1500 taxed at 18%
                tax += (salary - 4500.00) * 0.28;  // Amount above 4500 taxed at 28%
            }

            // Print the total tax with two decimal places
            System.out.printf("R$ %.2f%n", tax);
        }
        
        input.close();
    }
    }