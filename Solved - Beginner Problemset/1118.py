# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''

def calculate_average():
    valid_scores = []
    
    # Continue looping until two valid scores are entered
    while len(valid_scores) < 2:
        score = float(input())
        if 0 <= score <= 10:
            valid_scores.append(score)
        else:
            print("nota invalida")
    
    # Calculate the average of the two valid scores
    average = sum(valid_scores) / 2
    print(f"media = {average:.2f}")

def new_calculation():
    while True:
        print("novo calculo (1-sim 2-nao)")
        option = int(input())
        if option == 1:
            return True
        elif option == 2:
            return False

# Main program loop
while True:
    calculate_average()
    
    # Check if the user wants a new calculation or to exit
    if not new_calculation():
        break
