#include <stdio.h>
 
int main() {
   // problem 1005 = Average 1
   // SUBMISSION # 41180727
 
    /**
     * Escreva a sua solução aqui
     * Code your solution here
     * Escriba su solución aquí
     */
     double A, B, average;

    // Input two floating-point numbers
    scanf("%lf", &A);
    scanf("%lf", &B);

    // Calculate the weighted average
    average = ((A * 3.5) + (B * 7.5)) / 11.0;

    // Print the result with the required format
    printf("MEDIA = %.5lf\n", average);

    return 0;
}