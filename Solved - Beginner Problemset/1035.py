# Problem 1035 - Selection Test 1...
# Input: Reading four integer values
A, B, C, D = map(int, input().split())

# Validation: Checking the conditions
if B > C and D > A and (C + D) > (A + B) and C > 0 and D > 0 and A % 2 == 0:
    print("Valores aceitos")  # Accepted values
else:
    print("Valores nao aceitos")  # Values not accepted