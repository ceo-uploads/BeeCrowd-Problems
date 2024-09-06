# Input: Reading two integer values
A, B = map(int, input().split())

# Check if A is a multiple of B or B is a multiple of A
if A % B == 0 or B % A == 0:
    print("Sao Multiplos")
else:
    print("Nao sao Multiplos")
