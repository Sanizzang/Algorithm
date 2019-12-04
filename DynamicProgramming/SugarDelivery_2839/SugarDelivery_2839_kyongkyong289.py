#Finding minimum packs of sugar
def minimum_packs_of_sugar(n):
    buffer = []
    #making a buffer
    #buffer[n]'s value means minimum packs of sugar of nkg. 
    for i in range(5001):
        buffer += [0]
        
    #Minimum packs of sugar from 0 to 7kg
    buffer[0] = -1
    buffer[1] = -1
    buffer[2] = -1
    buffer[3] = 1
    buffer[4] = -1
    buffer[5] = 1
    buffer[6] = 2
    buffer[7] = -1
    
    #Since 8, 9, 10kg is possible, all weights same or more than 8kg is possible.
    for i in range(8, n + 1):
        #Choosing (n - 3)kg or (n - 5)kg which has minimum packs.
        #Since (n - 3)kg and (n - 5)kg is minimum-guaranteed, minimum of 1 + (n - 3)kg, 1 + (n - 5)kg is also minimum.
        if buffer[i - 3] != -1 and buffer[i - 5] != -1:
            buffer[i] = minimum_list([1 + buffer[i - 3], 1 + buffer[i - 5]])
        if buffer[i - 3] == -1 and buffer[i - 5] != -1:
            buffer[i] = minimum_list([1 + buffer[i - 5]])
        if buffer[i - 3] != -1 and buffer[i - 5] == -1:
            buffer[i] = minimum_list([1 + buffer[i - 3]])
        if buffer[i - 3] == -1 and buffer[i - 5] == -1:
            buffer[i] = -1
            
    #Returning value
    return buffer[n]
          
#This is a function which returns minimum value of list.
def minimum_list(list_sample):
    minimum = list_sample[0]
    for i in range(len(list_sample)):
        if list_sample[i] < minimum:
            minimum = list_sample[i]
    return minimum

#Input part
N = int(input())

#Print part
print(minimum_packs_of_sugar(N))