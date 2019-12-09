#Defining function which calculates cases of filling 2 x N tiles.
def tiling_2xN(n):
    #Declaring answer
    #answer[i] means cases of filling 2 x i tiles
    answer = []
    
    #Making answer 1001 sized list
    for i in range(1001):
        answer += [0]

    #For cases n = 1 and n = 2
    answer[1] = 1
    answer[2] = 2
    
    #For cases n >= 3
    #Since 2 x N tiles can be filled with 1 x 2 vertical tile + 2 x (N - 1) tiles
    #and horizontal 2 x 1 tiles vertically + 2 x (N - 2) tiles
    #answer[i] is answer[i - 1] + answer[i - 2]
    for i in range(3, n + 1):
        answer[i] = answer[i - 1] + answer[i - 2]
    
    #Returning value
    return answer[n]

#Input part
N = int(input())

#Using algorithm
answer = tiling_2xN(N) % 10007

#Output part
print(answer)    