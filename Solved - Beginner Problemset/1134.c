#include <stdio.h>
 
int main() {
 
    /**
     * Escreva a sua solução aqui
     * Code your solution here
     * Escriba su solución aquí
     */
     // problem 1134 - Type of Fuel...
     // SUBMISSION # 41721480
 
     int code;
    int alcohol = 0, gasoline = 0, diesel = 0;

    while (1) {
        // Read the input code
        scanf("%d", &code);

        // Process the code
        if (code == 1) {
            alcohol++;
        } else if (code == 2) {
            gasoline++;
        } else if (code == 3) {
            diesel++;
        } else if (code == 4) {
            break;
        } else {
            // Invalid code, request a new one (loop will continue)
            continue;
        }
    }

    // Output the results
    printf("MUITO OBRIGADO\n");
    printf("Alcool: %d\n", alcohol);
    printf("Gasolina: %d\n", gasoline);
    printf("Diesel: %d\n", diesel);

    return 0;
}