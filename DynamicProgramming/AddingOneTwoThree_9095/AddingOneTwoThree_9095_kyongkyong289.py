#Function which calculates cases of making n by adding 1, 2, 3
def adding_one_two_three(n):
    #Making buffer
    buffer = []
    
    #Filling 0 in size 11 buffer
    for i in range(11):
        buffer += [0]
        
    #Setting cases of n = 1, n = 2, n = 3
    buffer[1] = 1
    buffer[2] = 2
    buffer[3] = 4
    
    #The cases of making n by adding 1, 2, 3 is
    #F(n) = F(n - 1) + F(n - 2) + F(n - 3)
    for i in range(4, n + 1):
        buffer[i] = buffer[i - 1] + buffer[i - 2] + buffer[i - 3]

    #Returning value
    return buffer[n]

#Declaring variables
input_list = []
output_list = []
temp = []
cases = 0

#Input part
cases = int(input())
for i in range(cases):
    temp = [int(input())]
    input_list += temp
    temp = []
    
#Applying algorithm
for i in range(cases):
    temp = [adding_one_two_three(input_list[i])]
    output_list += temp
    temp = []

#Output part
for i in range(cases):
    print(output_list[i])
