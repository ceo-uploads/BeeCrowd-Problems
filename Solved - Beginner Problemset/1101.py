while True:
    # Input: Read two integers M and N
    M, N = map(int, input().split())

    # Break the loop if either M or N is zero or negative
    if M <= 0 or N <= 0:
        break

    # Find the smaller and larger of M and N
    start = min(M, N)
    end = max(M, N)

    # Create the sequence from the smallest to the largest
    sequence = list(range(start, end + 1))
    
    # Calculate the sum of the sequence
    total_sum = sum(sequence)

    # Print the sequence and the sum in the required format
    sequence_str = ' '.join(map(str, sequence))
    print(f"{sequence_str} Sum={total_sum}")
