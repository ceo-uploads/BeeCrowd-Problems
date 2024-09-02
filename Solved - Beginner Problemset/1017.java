import java.io.IOException;
import java.util.Scanner;
// Problem 1017 - Fuel Spent...
// SUBMISSION # 41198743...
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);

        // Read the time spent and the average speed
        int time = scanner.nextInt();
        int speed = scanner.nextInt();

        // Calculate the distance
        double distance = time * speed;

        // Calculate the fuel needed
        double fuelNeeded = distance / 12;

        // Print the result with 3 decimal places
        System.out.printf("%.3f%n", fuelNeeded);
 
    }
 
}