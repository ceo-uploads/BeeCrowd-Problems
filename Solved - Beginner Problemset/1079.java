import java.io.IOException;
import java.util.Scanner; 
// Problem 1079 - Weighted Averages..
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
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            
            double avg = ((a*2)+(b*3)+(c*5))/10;
            System.out.printf("%.1f%n",avg);
        }
 
    }
 
}