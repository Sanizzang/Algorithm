#Function which finds number of prime numbers
def number_of_prime(numbers):
    number = 0
    
    #For numbers
    for i in range(len(numbers)):
        #If number is prime number
        if is_prime(numbers[i]) == True:
            number += 1
            
    #Returning value
    return number
    
#Determinating whether is prime number
def is_prime(n):
    #If n is 1
    if n == 1:
        return False
        
    #From 2 to n - 1
    for i in range(2, n):
        if n % i == 0:
            return False

    #If n is not divided by those numbers
    return True

#Input part
cases = int(input())
input_list = []
temp = []
temp = list(map(int, input().split()))
input_list += temp
answer = 0

#Applying algorithm
answer = number_of_prime(input_list)

#Output part
print(answer)
