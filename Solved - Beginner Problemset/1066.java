import java.io.IOException;
import java.util.Scanner;
// Problem 1066 - Even, Odd, Positive and Negative...
// SUBMISSION # 41357295...
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
         int c = input.nextInt();
         int d = input.nextInt();
         int e = input.nextInt();
         int pos = 0;
         int neg = 0;
         int odd = 0;
         int evn = 0;
         
         int[] arr = {a, b, c, d, e};
         
         for (int num : arr) {
             if (num > 0 ) {
                 pos++;
             } else if (num < 0) {
                 neg++;
             }
         }
         
         for (int check : arr) {
             if (check % 2 == 0) {
                 evn++;
             } else if (check % 2 != 0) {
                 odd++;
             }
         }
         
         System.out.println(evn+" valor(es) par(es)");
         System.out.println(odd+" valor(es) impar(es)");
         System.out.println(pos+" valor(es) positivo(s)");
         System.out.println(neg+" valor(es) negativo(s)");
         
         input.close();
 
    }
 
}