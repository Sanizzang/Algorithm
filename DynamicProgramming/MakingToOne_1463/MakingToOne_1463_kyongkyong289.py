#Finding least trial
def least_trial_num(n):
    #making 1000001 size buffer
    buffer = []
    for i in range(1000001):
        buffer += [0]
        
    #Minimum calculation of 1 is 0 times.
    buffer[1] = 0
    
    #Minimum calculations of other values
    for i in range(2, n + 1):
        #Since calculations of (n - 1), (n / 2), (n / 3) is all minimum-guaranteed, n is also minimum.
        #First, we set to calculations of n to 1 + calculations of (n - 1)
        buffer[i] = buffer[i - 1] + 1
        
        #Comparing two if n can be divided by 2
        if i % 2 == 0:
            buffer[i] = min2(buffer[i], buffer[i // 2] + 1)
        #Comparing two if n can be divided by 3
        if i % 3 == 0:
            buffer[i] = min2(buffer[i], buffer[i // 3] + 1)
            
    #Returning a value
    return buffer[n]
        
#This is fumction which finds least value of two
def min2(a, b):
    if a < b: return a
    else: return b
    
#Input part
N = int(input())

#Output part
print(least_trial_num(N))