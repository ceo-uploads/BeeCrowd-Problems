while True:
    # Read two integers X and Y
    X, Y = map(int, input().split())
    
    # Terminate the loop if X is equal to Y
    if X == Y:
        break
    
    # Check the order and print the appropriate message
    if X < Y:
        print("Crescente")
    else:
        print("Decrescente")
