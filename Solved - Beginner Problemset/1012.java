import java.io.IOException;
import java.util.Scanner;
// problem 1012 - Area...
// SUBMISSION # 41196724...
 
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
         final double PI = 3.14159; // Define the value of PI

        Scanner scanner = new Scanner(System.in);

        // Read the floating-point values A, B, and C
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        // a) Area of the right-angled triangle with base A and height C
        double triangleArea = (A * C) / 2.0;

        // b) Area of the circle with radius C
        double circleArea = PI * Math.pow(C, 2);

        // c) Area of the trapezium with bases A, B and height C
        double trapeziumArea = ((A + B) * C) / 2.0;

        // d) Area of the square with side B
        double squareArea = Math.pow(B, 2);

        // e) Area of the rectangle with sides A and B
        double rectangleArea = A * B;

        // Print the results with appropriate labels and four decimal places
        System.out.printf("TRIANGULO: %.3f%n", triangleArea);
        System.out.printf("CIRCULO: %.3f%n", circleArea);
        System.out.printf("TRAPEZIO: %.3f%n", trapeziumArea);
        System.out.printf("QUADRADO: %.3f%n", squareArea);
        System.out.printf("RETANGULO: %.3f%n", rectangleArea);
 
    }
 
}