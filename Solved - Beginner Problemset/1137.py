# -*- coding: utf-8 -*-

'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''

def grenal_statistics():
    inter_wins = 0
    gremio_wins = 0
    draws = 0
    grenais = 0

    while True:
        # Input the goals for Inter and Gremio
        inter_goals, gremio_goals = map(int, input().split())
        grenais += 1

        # Determine the result of the match
        if inter_goals > gremio_goals:
            inter_wins += 1
        elif gremio_goals > inter_goals:
            gremio_wins += 1
        else:
            draws += 1

        # Ask if the user wants to input another match
        print("Novo grenal (1-sim 2-nao)")
        choice = int(input())

        # If the choice is 2, break the loop
        if choice == 2:
            break

    # Output the statistics
    print(f"{grenais} grenais")
    print(f"Inter:{inter_wins}")
    print(f"Gremio:{gremio_wins}")
    print(f"Empates:{draws}")

    # Determine which team won the most GRENAIS or if there's no overall winner
    if inter_wins > gremio_wins:
        print("Inter venceu mais")
    elif gremio_wins > inter_wins:
        print("Gremio venceu mais")
    else:
        print("Não houve vencedor")

# Call the function to execute the program
grenal_statistics()
