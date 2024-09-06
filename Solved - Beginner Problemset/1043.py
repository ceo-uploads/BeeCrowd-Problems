# -*- coding: utf-8 -*-
# Problem 1043 - Triangle...
# SUBMISSION # 41289326...
'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''

# Input: Reading the three floating point values
A, B, C = map(float, input().split())

# Check if the values can form a triangle using the triangle inequality theorem
if A + B > C and A + C > B and B + C > A:
    # It's a triangle, so calculate the perimeter
    perimeter = A + B + C
    print(f"Perimetro = {perimeter:.1f}")
else:
    # It's not a triangle, so calculate the area of the trapezium
    area = ((A + B) * C) / 2
    print(f"Area = {area:.1f}")
