// Online C compiler to run C program online\
// Problem 1075 - Remaining 2...
// SUBMISSION # 41420238
#include <stdio.h>
#include <stdbool.h>

int main() {
    int n;
    long num = 0;
    long i = 0;

    // Read an integer input
    scanf("%d", &n);
    
    // Continue generating numbers until num exceeds 10,000
    while (true) {
        num = (n * i) + 2;
        if (num >= 10000) {
            break;
        }
        printf("%ld\n", num);
        i++;
    }

    return 0;
}
