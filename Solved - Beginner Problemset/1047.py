# Input: Reading four integers representing start and end time
start_hour, start_minute, end_hour, end_minute = map(int, input().split())

# Convert the start and end times into minutes
start_total_minutes = start_hour * 60 + start_minute
end_total_minutes = end_hour * 60 + end_minute

# Calculate the duration in minutes
if end_total_minutes > start_total_minutes:
    duration_minutes = end_total_minutes - start_total_minutes
elif end_total_minutes == start_total_minutes:
    # If the start and end times are the same, the game lasts 24 hours
    duration_minutes = 24 * 60
else:
    # If the game ends the next day
    duration_minutes = (24 * 60 - start_total_minutes) + end_total_minutes

# Convert the total duration back to hours and minutes
duration_hours = duration_minutes // 60
duration_minutes = duration_minutes % 60

# Output the result
print(f"O JOGO DUROU {duration_hours} HORA(S) E {duration_minutes} MINUTO(S)")
