import java.io.IOException;
import java.util.Scanner;
// Problem 1052 - Month...
// SUBMISSION # 41342020...
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
         
         int day = input.nextInt();
         
         switch (day) {
             case 1:
                 System.out.println("January");
                 break;
             case 2:
                 System.out.println("February");
                 break;
             case 3:
                 System.out.println("March");
                 break;
             case 4:
                 System.out.println("April");
                 break;
             case 5:
                 System.out.println("May");
                 break;
             case 6:
                 System.out.println("June");
                 break;
             case 7:
                 System.out.println("July");
                 break;
             case 8:
                 System.out.println("August");
                 break;
             case 9:
                 System.out.println("September");
                 break;
             case 10:
                 System.out.println("October");
                 break;
             case 11:
                 System.out.println("November");
                 break;
             case 12:
                 System.out.println("December");
                 break;
            default:
                 System.out.println();
                 break;
         }
 
    }
 
}