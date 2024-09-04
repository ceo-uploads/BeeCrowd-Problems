# -*- coding: utf-8 -*-
# Problem -1021...
'''
Escreva a sua solução aqui
Code your solution here
Escriba su solución aquí
'''

# Input: Reading the floating point value
N = float(input())

# Convert the floating-point number into an integer number of cents
# This helps to avoid floating-point precision issues
amount_in_cents = int(round(N * 100))

# Define the values of the notes and coins in cents
notes = [10000, 5000, 2000, 1000, 500, 200]
coins = [100, 50, 25, 10, 5, 1]

# Output the notes
print("NOTAS:")
for note in notes:
    count = amount_in_cents // note
    print(f"{count} nota(s) de R$ {note / 100:.2f}")
    amount_in_cents %= note

# Output the coins
print("MOEDAS:")
for coin in coins:
    count = amount_in_cents // coin
    print(f"{count} moeda(s) de R$ {coin / 100:.2f}")
    amount_in_cents %= coin
