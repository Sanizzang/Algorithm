#Function which calculates adding cycle
def adding_cycle(n):
    #Declaring variables
    digits = []
    new_number = 0
    cycle = 0
    
    #Setting new_number to n
    new_number = n
    
    while 1:
        #Dividing digits of new_number 
        digits = two_digits_divide(new_number)
        
        #Making new_number
        new_number = digits[1] * 10 + (digits[0] + digits[1]) % 10
        
        #Adding cycle
        cycle += 1
        
        #If new_number returned to n then ends loop
        if new_number == n:
            break
            
    #Returning value
    return cycle
    
#Function which divides to two digits
def two_digits_divide(n):
    a = [0, 0]
    a[0] = n // 10
    a[1] = n % 10
    return a

#Input part
input_num = int(input())

#Applying Algorithm
output_num = adding_cycle(input_num)

#Output part
print(output_num)