import java.io.IOException;
import java.util.Scanner; 
// Problem 1064 - Positives and Average...
// SUBMISSION # 41357145...
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
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        int pos = 0;
        double sum = 0;
        
        double[] array = {a, b, c, d, e, f};
        
        for (double num : array) {
            if (num > 0) {
                pos++;
                sum += num;
            }
        }
        
        double avg = sum / pos;
        System.out.println(pos+" valores positivos");
        System.out.printf("%.1f%n", avg);
 
    }
 
}