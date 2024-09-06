# -*- coding: utf-8 -*-
# Problem 1040 - Average 3...
# SUBMISSION # 41272377...
'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''

# Input: Reading the four grades with one decimal place
N1, N2, N3, N4 = map(float, input().split())

# Weights for the grades
weights = [2, 3, 4, 1]

# Calculate the weighted average
average = (N1 * weights[0] + N2 * weights[1] + N3 * weights[2] + N4 * weights[3]) / sum(weights)

# Print the calculated average
print(f"Media: {average:.1f}")

# Determine the student's status based on the average
if average >= 7.0:
    print("Aluno aprovado.")
elif average < 5.0:
    print("Aluno reprovado.")
else:
    print("Aluno em exame.")
    
    # Input: Reading the exam score if the student is in exam
    exam_score = float(input())
    print(f"Nota do exame: {exam_score:.1f}")
    
    # Recalculate the final average
    final_average = (average + exam_score) / 2
    
    # Determine the final status based on the recalculated average
    if final_average >= 5.0:
        print("Aluno aprovado.")
    else:
        print("Aluno reprovado.")
    
    # Print the final average
    print(f"Media final: {final_average:.1f}")
