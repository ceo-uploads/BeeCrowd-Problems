import java.io.IOException;
import java.util.Scanner; 
// Problem 1050 - DDD...
// SUBMISSION # 41341090...
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
         
         int num = input.nextInt();
         
         if (num == 61) {
             System.out.println("Brasilia");
         } else if (num == 71) {
             System.out.println("Salvador");
         } else if (num == 11) {
             System.out.println("Sao Paulo");
         } else if (num == 21) {
             System.out.println("Rio de Janeiro");
         } else if (num == 32) {
             System.out.println("Juiz de Fora");
         } else if (num == 19) {
             System.out.println("Campinas");
         } else if (num == 27) {
             System.out.println("Vitoria");
         } else if (num == 31) {
             System.out.println("Belo Horizonte");
         } else {
             System.out.println("DDD nao cadastrado");
         }
    }
 
}