import java.io.IOException;
import java.util.Scanner;
// Problem 1015 - Distance Between Two Points...
// SUBMISSION # 41197416...
 
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
         Scanner scanner = new Scanner(System.in);

        // Read the coordinates for the first point (x1, y1)
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        // Read the coordinates for the second point (x2, y2)
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Calculate the distance between the two points
        double res = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
         
         System.out.printf("%.4f%n", res);
 
    }
 
}