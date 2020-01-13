#Function which finds disassemble and sum
def disassemble_sum(n):
    #Declaring variables
    number = 0
    is_possible = False
    
    #Finds whether disassemble and sum
    while 1:
        #If disassemble and sum of number is n
        if number + sum(digits(number)) == n:
            is_possible = True
            break
        #If there is no disassemble and sum
        if number > n:
            is_possible = False
            break
        #Adding 1
        number += 1
    #If it is possible
    if is_possible == True:
        return number
    #If is is not possible
    else:
        return 0
        
#Function which finds lists of digits of n
def digits(n):
    digit = []
    while n > 0:
        digit += [n % 10]
        n = n // 10
    digit.reverse()
    return digit

#Input part
N = int(input())
answer = 0

#Applying algorithm
answer = disassemble_sum(N)

#Output part
print(answer)
