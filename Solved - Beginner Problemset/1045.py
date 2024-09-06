# Input: Reading three double values
A, B, C = map(float, input().split())

# Sorting the sides in decreasing order so that A is the largest
sides = [A, B, C]
sides.sort(reverse=True)
A, B, C = sides[0], sides[1], sides[2]

# Checking the triangle conditions
if A >= B + C:
    print("NAO FORMA TRIANGULO")
else:
    # Checking for the type of triangle based on angles
    if A**2 == B**2 + C**2:
        print("TRIANGULO RETANGULO")
    elif A**2 > B**2 + C**2:
        print("TRIANGULO OBTUSANGULO")
    elif A**2 < B**2 + C**2:
        print("TRIANGULO ACUTANGULO")
    
    # Checking for specific types of triangles based on side lengths
    if A == B == C:
        print("TRIANGULO EQUILATERO")
    elif A == B or B == C or A == C:
        print("TRIANGULO ISOSCELES")
