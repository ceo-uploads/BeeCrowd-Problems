import java.io.IOException;
import java.util.Scanner; 
// Problem 1046 - Game Time...
// SUBMISSION # 41315640...
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
        int a = input.nextInt();
        int b = input.nextInt();
        
        int hrs = 24;
        
        if (b < a) {
            int time = hrs - a + b;
            System.out.println("O JOGO DUROU "+time+" HORA(S)");
        } else if (a < b) {
            int time = b - a;
            System.out.println("O JOGO DUROU "+time+" HORA(S)");
        } else if (a == b) {
            System.out.println("O JOGO DUROU "+hrs+" HORA(S)");
        }
 
    }
 
}