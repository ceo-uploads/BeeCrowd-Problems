#include<stdio.h>
int main() {
    // problem 1008 = Salary...
    // SUBMISSION # 41181149
    int num, hr;
    float sl;
    scanf("%d %d %f", &num, &hr, &sl);
    
    float total = hr * sl;
    
    printf("NUMBER = %d\n", num);
    printf("SALARY = U$ %.2f\n", total);
}