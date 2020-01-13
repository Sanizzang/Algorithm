#Function which finds 45 minutes before current time
def alarm_clock(h, m):
    #Finding total minutes passed
    total_minutes = h * 60 + m
    ans = []

    #Subtracting 45 minutes
    if total_minutes >= 45:
        answer_minutes = total_minutes - 45
    else:
        answer_minutes = total_minutes - 45 + 1440

    #Finding answer hours, and minutes
    ans += [answer_minutes // 60, answer_minutes % 60]

    #Returning value
    return ans

#Input part
H, M = map(int, input().split())
answer_list = []

#Applying algorithm
answer_list = alarm_clock(H, M)

#Output part
for i in range(len(answer_list)):
    print(answer_list[i], end = " ")
print()