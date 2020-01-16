#Finding least number of actions
def binary_game(start, end):
    #Declaring Variables
    queue = []
    nodes = []
    distance = []
    visited = []
    neighbor_list = []

    #If start = end (means no need to move)
    if start == end:
        return 0
    
    #Making nodes
    for i in range(1024):
        nodes += [num_to_binary_digit(i)]

    #Making distance
    for i in range(1024):
        distance += [0]

    #Making visited to false
    for i in range(1024):
        visited += [False]

    #Adding first position to queue
    queue += [start]

    #Making first position visited
    visited[binary_digit_to_num(start)] = True

    #While queue is not empty
    while len(queue) != 0:
        #Finding neighbors
        neighbor_list = neighbors(queue[0])

        #For neighbor_list
        for i in range(len(neighbor_list)):
            #If neighbor is not visited
            if visited[binary_digit_to_num(neighbor_list[i])] == False:
                #Adding queue
                queue += [neighbor_list[i]]

                #Setting distance
                distance[binary_digit_to_num(neighbor_list[i])] = distance[binary_digit_to_num(queue[0])] + 1

                #Making node visited
                visited[binary_digit_to_num(neighbor_list[i])] = True

        #Popping first element of queue
        queue.pop(0)

    #Returning value
    return distance[binary_digit_to_num(end)]

#Function which turns number to binary digit        
def num_to_binary_digit(n):
    binary_digit = ""
    binary_digit_list = []
    
    while n > 0:
        binary_digit_list += [n % 2]
        n = n // 2
        
    for i in range(len(binary_digit_list)):
        binary_digit += str(binary_digit_list[len(binary_digit_list) - 1 - i])
        
    return binary_digit

#Functin which turns binary digit to number    
def binary_digit_to_num(binary_digit):
    num = 0
    
    for i in range(len(binary_digit)):
        num *= 2
        num += int(binary_digit[i])
        
    return num

#Finding neighbors
def neighbors(binary_digit):
    neighbor_list = []
    temp = []
    temp_digit = ''

    #Finding neighbor which is added by 1
    if binary_digit != '1111111111' and binary_digit[len(binary_digit) - 1] == '1':
        neighbor_list += [num_to_binary_digit(binary_digit_to_num(binary_digit) + 1)]

    #Finding neighbor which is subtracted by 1
    if binary_digit != '1' and binary_digit[len(binary_digit) - 1] == '0':
        neighbor_list += [num_to_binary_digit(binary_digit_to_num(binary_digit) - 1)]

    #Finding neighbor which one digit is turned to complementary number
    if len(binary_digit) >= 2:
        for i in range(1, len(binary_digit)):
            temp = list(binary_digit)
            if temp[i] == '1':
                temp[i] = '0'
            else:
                temp[i] = '1'

            for j in range(len(temp)):
                temp_digit += temp[j]

            neighbor_list += [temp_digit]
            temp_digit = ''

    return neighbor_list

#Input part    
input_start = input()
input_end = input()
output = 0

#Applying algorithm
output = binary_game(input_start, input_end)

#Output part
print(output)

