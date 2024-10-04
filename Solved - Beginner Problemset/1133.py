def numbers_divisible_by_5_with_remainder_2_or_3(x, y):
    # Ensure numbers are in ascending order
    start = min(x, y)
    end = max(x, y)

    # Iterate through numbers between start and end (exclusive)
    for number in range(start + 1, end):
        if number % 5 == 2 or number % 5 == 3:
            print(number)

# Input
x = int(input())
y = int(input())

# Output the result
numbers_divisible_by_5_with_remainder_2_or_3(x, y)