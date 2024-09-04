import java.io.IOException;
import java.util.Scanner;
// Problem - 1019...
// SUBMISSION # 41227770...
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
         int time = input.nextInt();
         
         int hr = counthr(time);
         int min = countmin(time);
         int sec = countsec(time);
         
         System.out.println(hr+":"+min+":"+sec);
         
         input.close();
 
    }
    
    public static int counthr(int time) {
        int x = time / 3600;
        return x;
    }
    
    public static int countmin(int time) {
        int x = time % 3600;
        int y = x / 60;
        return y;
    }
    
    public static int countsec(int time) {
        int x = time % 3600;
        int y = x % 60;
        return y;
    }
 
}