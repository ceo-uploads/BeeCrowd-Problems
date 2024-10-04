# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''

def sum_not_divisible_by_13(x, y):
    # Ensure that the numbers are in the correct order (x should be the smaller one)
    start = min(x, y)
    end = max(x, y)

    total_sum = 0

    # Iterate through the range from start to end (inclusive)
    for number in range(start, end + 1):
        if number % 13 != 0:
            total_sum += number
    
    return total_sum

# Input
x = int(input())
y = int(input())

# Output the result
result = sum_not_divisible_by_13(x, y)
print(result)
