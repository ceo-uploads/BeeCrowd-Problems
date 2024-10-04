def main():
    valid_scores_count = 0
    total_score = 0.0

    while valid_scores_count < 2:
        score = float(input())

        # Check if the score is valid
        if 0 <= score <= 10:
            total_score += score
            valid_scores_count += 1
        else:
            print("nota invalida")

    # Calculate and print the average of the two valid scores
    average = total_score / 2
    print(f"media = {average:.2f}")

if __name__ == "__main__":
    main()
