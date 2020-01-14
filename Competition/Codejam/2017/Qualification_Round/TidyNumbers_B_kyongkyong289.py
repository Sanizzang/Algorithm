def largest_tidy_number(n):
    #Declaring variables
    out = 0
    digit_n = digits(n)
    position = 0
    out_digit = []
    
    #If number of digits is 1
    if len(digit_n) == 1:
        return n
    
    #Finding decreasing position
    for i in range(len(digit_n) - 1):
        if digit_n[i] > digit_n[i + 1]:
            position = i
            while position > 0:
                #Finding where to decrease digit by 1
                if digit_n[position] > digit_n[position - 1]:
                    break
                position -= 1
            break
        #If the number is tidy number
        if i == len(digit_n) - 2:
            position = i + 1
            break
            
    #For case which number of digits is decreased by 1
    if digit_n[position] == 1:
        for i in range(len(digit_n) - 1):
            out_digit += [9]
            
    #For tidy numbers
    elif position == len(digit_n) - 1:
        for i in range(len(digit_n)):
            out_digit += [digit_n[i]]
            
    #For normal cases
    else:
        for i in range(position):
            out_digit += [digit_n[i]]
            
        out_digit += [digit_n[position] - 1]
        
        for i in range(position + 1, len(digit_n)):
            out_digit += [9]
    
    #Returnnig values
    out = digits_to_num(out_digit)
    return out
    
#Function which gets digits
def digits(n):
    digit = []
    while n > 0:
        digit += [n % 10]
        n = n // 10
    digit.reverse()
    return digit

#Function which makes number from digits
def digits_to_num(digit_n):
    num = 0
    for i in range(len(digit_n)):
        num *= 10
        num += digit_n[i]
    return num

#Input part
input_file = open('Large_input.txt', 'r')
output_file = open('Answer_kyongkyong289.txt', 'w')
cases = int(input_file.readline())
input_list = []
answer_list = []
temp = 0

for i in range(cases):
    temp = int(input_file.readline())
    input_list += [temp]
    temp = 0

#Applying algorithm
for i in range(cases):
    answer_list += [largest_tidy_number(input_list[i])]

#Output part
for i in range(cases):
    output_file.write('Case #' + str(i + 1) + ': ' + str(answer_list[i]) + '\n')

input_file.close()
output_file.close()
