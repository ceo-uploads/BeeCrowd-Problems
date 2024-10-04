#include <stdio.h>
 
int main() {
 
    /**
     * Escreva a sua solução aqui
     * Code your solution here
     * Escriba su solución aquí
     */
 
    int N, i, count = 1;
    
    // Read the input value of N
    scanf("%d", &N);
    
    // Loop N times to generate the output
    for (i = 0; i < N; i++) {
        // Print 3 numbers followed by "PUM"
        printf("%d %d %d PUM\n", count, count + 1, count + 2);
        count += 4; // Increment by 4 for the next set of numbers
    }
    
    return 0;
}