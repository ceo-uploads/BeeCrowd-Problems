import java.io.IOException;
import java.util.Scanner; 
// Problem 1038 - Snack...
// 
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
        int opt = input.nextInt();
        int quantity = input.nextInt();
        
        double price = getPrice(opt);
        
        double r = price * quantity;
        
        System.out.printf("Total: R$ %.2f%n", r);
        
    }
    
    public static double getPrice(int opt) {
        double price = 0.00;
        if (opt == 1) {
            price =  4.00;
        } else if (opt == 2) {
            price = 4.50;
        } else if (opt == 3) {
            price = 5.00;
        } else if (opt == 4) {
            price = 2.00;
        } else if (opt == 5) {
            price = 1.50;
        }
        
        return price;
    }
 
}