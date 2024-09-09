import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
// Problem 1049 - Animal..
// SUBMISSION # 41340848...
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
        
        // Read the input values
        String frst = input.nextLine();
        String sec = input.nextLine();
        String thrd = input.nextLine();
        
        // Store the input into an array
        String[] Input = {frst, sec, thrd};
        
        // Predefined configuration arrays
        String[] conf1 = {"vertebrado", "ave", "carnivoro"};
        String[] conf2 = {"vertebrado", "ave", "onivoro"};
        String[] conf3 = {"vertebrado", "mamifero", "onivoro"};
        String[] conf4 = {"vertebrado", "mamifero", "herbivoro"};
        String[] conf5 = {"invertebrado", "inseto", "hematofago"};
        String[] conf6 = {"invertebrado", "inseto", "herbivoro"};
        String[] conf7 = {"invertebrado", "anelideo", "hematofago"};
        String[] conf8 = {"invertebrado", "anelideo", "onivoro"};
        
        // Check the input against each configuration
        if (Arrays.equals(Input, conf1)) {
            System.out.println("aguia");
        } else if (Arrays.equals(Input, conf2)) {
            System.out.println("pomba");
        } else if (Arrays.equals(Input, conf3)) {
            System.out.println("homem");
        } else if (Arrays.equals(Input, conf4)) {
            System.out.println("vaca");
        } else if (Arrays.equals(Input, conf5)) {
            System.out.println("pulga");
        } else if (Arrays.equals(Input, conf6)) {
            System.out.println("lagarta");
        } else if (Arrays.equals(Input, conf7)) {
            System.out.println("sanguessuga");
        } else if (Arrays.equals(Input, conf8)) {
            System.out.println("minhoca");
        } else {
            System.out.println("Animal not found");
        }
 
    }
 
}