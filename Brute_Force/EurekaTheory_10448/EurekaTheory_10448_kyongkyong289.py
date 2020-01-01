#Defining function which finds whether a number is expressed by sum of three triangle numbers
def three_triangle_sum(n):
    triangle_numbers = []
    is_possible = False
    num = 1
    #Finding triangle numbers which is less than 1000
    while 1:
        if num * (num + 1) // 2 > 1000:
            break
        triangle_numbers += [num * (num + 1) // 2]
        num += 1
    #Finding all of cases
    for i in range(len(triangle_numbers)):
        for j in range(len(triangle_numbers)):
            for k in range(len(triangle_numbers)):
                #If there is a method of adding three triangle numbers
                if triangle_numbers[i] + triangle_numbers[j] + triangle_numbers[k] == n:
                    return 1
    #Else
    return 0

#Input part
cases = int(input())
input_list = []
answer_list = []
temp = 0

for i in range(cases):
    temp = int(input())
    input_list += [temp]

#Applying apgorithm
for i in range(cases):
    temp = three_triangle_sum(input_list[i])
    answer_list += [temp]
    
#Output part
for i in range(cases):
    print(answer_list[i])