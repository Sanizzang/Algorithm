#Function which calculates number of stick required
def num_of_stick(n):
    #declaring variables
    #binary_list is list of digits which is binary of n
    binary_list = []
    num_stick = 0
    
    #While n is greater than 1
    while n >= 1:
        #If n is divided by 2
        if n % 2 == 0:
            binary_list += [0]
            
        #If remainder of n divided by 2 is 1
        else:
            binary_list += [1]
            
        #Dividing n by 2
        n = n // 2
        
    #Counting number of 1
    for i in range(len(binary_list)):
        if binary_list[i] == 1:
            num_stick += 1
            
    #Returning value
    return num_stick

#Input part
X = int(input())

#Applying algorithm
answer = num_of_stick(X)

#Output part
print(answer)