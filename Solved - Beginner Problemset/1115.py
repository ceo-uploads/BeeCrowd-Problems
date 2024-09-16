while True:
    # Read the coordinates X and Y
    X, Y = map(int, input().split())
    
    # Terminate the loop if either X or Y is zero
    if X == 0 or Y == 0:
        break
    
    # Determine the quadrant based on the signs of X and Y
    if X > 0 and Y > 0:
        print("primeiro")
    elif X < 0 and Y > 0:
        print("segundo")
    elif X < 0 and Y < 0:
        print("terceiro")
    elif X > 0 and Y < 0:
        print("quarto")
