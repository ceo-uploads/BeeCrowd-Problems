import java.io.IOException;
import java.util.Scanner;
// Problem 1114 = Fixed Password...
// SUBMISSION # 41491243...
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
         int pass = 2002;
        
        Scanner input = new Scanner(System.in);
        
        while (true) {
            int n = input.nextInt();
            
            if (n == pass) {
                System.out.println("Acesso Permitido");
                return;
            } else {
                System.out.println("Senha Invalida");
            }
        }
    }
 
}