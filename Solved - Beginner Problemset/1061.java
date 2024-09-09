import java.io.IOException;
import java.util.Scanner;
// Problem 1061 - Event Time..
// SUBMISSION # 41345406...
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
         Scanner sc = new Scanner(System.in);
        
        // Input start day and time
        sc.next(); // Ignore "Dia"
        int startDay = sc.nextInt();
        int startHour = sc.nextInt();
        sc.next(); // Ignore ":"
        int startMinute = sc.nextInt();
        sc.next(); // Ignore ":"
        int startSecond = sc.nextInt();
        
        // Input end day and time
        sc.next(); // Ignore "Dia"
        int endDay = sc.nextInt();
        int endHour = sc.nextInt();
        sc.next(); // Ignore ":"
        int endMinute = sc.nextInt();
        sc.next(); // Ignore ":"
        int endSecond = sc.nextInt();
        
        // Convert start time to total seconds
        int startInSeconds = startSecond + startMinute * 60 + startHour * 3600 + startDay * 86400;
        
        // Convert end time to total seconds
        int endInSeconds = endSecond + endMinute * 60 + endHour * 3600 + endDay * 86400;
        
        // Calculate the total duration in seconds
        int totalDurationInSeconds = endInSeconds - startInSeconds;
        
        // Break the total duration into days, hours, minutes, and seconds
        int days = totalDurationInSeconds / 86400;
        totalDurationInSeconds %= 86400;
        int hours = totalDurationInSeconds / 3600;
        totalDurationInSeconds %= 3600;
        int minutes = totalDurationInSeconds / 60;
        int seconds = totalDurationInSeconds % 60;
        
        // Print the results
        System.out.println(days + " dia(s)");
        System.out.println(hours + " hora(s)");
        System.out.println(minutes + " minuto(s)");
        System.out.println(seconds + " segundo(s)");
        
        sc.close();
 
    }
 
}