#Function which finds largest number tetromino 
def tetromino(board):
    #Declaring variables
    rows = len(board)
    columns = len(board[0])
    maximum = 0
    temp = 0
    
    #For I-mino
    for i in range(rows - 3):
        for j in range(columns):
            temp = board[i][j] + board[i + 1][j] + board[i + 2][j] + board[i + 3][j]
            if temp > maximum:
                maximum = temp
                
    #For 90 degrees rotated counterclockwise I-mino
    for i in range(rows):
        for j in range(columns - 3):
            temp = board[i][j] + board[i][j + 1] + board[i][j + 2] + board[i][j + 3]
            if temp > maximum:
                maximum = temp
                
    #For O-mino
    for i in range(rows - 1):
        for j in range(columns - 1):
            temp = board[i][j] + board[i][j + 1] + board[i + 1][j] + board[i + 1][j + 1]
            if temp > maximum:
                maximum = temp
    
    #For T-mino
    for i in range(rows - 1):
        for j in range(columns - 2):
            temp = board[i][j] + board[i][j + 1] + board[i][j + 2] + board[i + 1][j + 1]
            if temp > maximum:
                maximum = temp
                
    #For 90 degrees rotated counterclockwise T-mino
    for i in range(rows - 2):
        for j in range(columns - 1):
            temp = board[i][j] + board[i + 1][j] + board[i + 2][j] + board[i + 1][j + 1]
            if temp > maximum:
                maximum = temp
                
    #For 180 degrees rotated counterclockwise T-mino
    for i in range(1, rows):
        for j in range(columns - 2):
            temp = board[i][j] + board[i][j + 1] + board[i][j + 2] + board[i - 1][j + 1]
            if temp > maximum:
                maximum = temp
                
    #For 270 degrees rotated counterclockwise T-mino
    for i in range(1, rows - 1):
        for j in range(columns - 1):
            temp = board[i][j] + board[i - 1][j + 1] + board[i][j + 1] + board[i + 1][j + 1]
            if temp > maximum:
                maximum = temp
                
    #For J-mino
    for i in range(2, rows):
        for j in range(columns - 1):
            temp = board[i][j] + board[i - 2][j + 1] + board[i - 1][j + 1] + board[i][j + 1]
            if temp > maximum:
                maximum = temp
                
    #For 90 degrees rotated counterclockwise J-mino
    for i in range(rows - 1):
        for j in range(columns - 2):
            temp = board[i][j] + board[i][j + 1] + board[i][j + 2] + board[i + 1][j + 2]
            if temp > maximum:
                maximum = temp
                
    #For 180 degrees rotated counterclockwise J-mino
    for i in range(rows - 2):
        for j in range(columns - 1):
            temp = board[i][j] + board[i + 1][j] + board[i + 2][j] + board[i][j + 1]
            if temp > maximum:
                maximum = temp
                
    #For 270 degrees rotated counterclockwise J-mino
    for i in range(rows - 1):
        for j in range(columns - 2):
            temp = board[i][j] + board[i + 1][j] + board[i + 1][j + 1] + board[i + 1][j + 2]
            if temp > maximum:
                maximum = temp
                
    #For L-mino
    for i in range(rows - 2):
        for j in range(columns - 1):
            temp = board[i][j] + board[i + 1][j] + board[i + 2][j] + board[i + 2][j + 1]
            if temp > maximum:
                maximum = temp
                
    #For 90 degrees rotated counterclockwise L-mino
    for i in range(rows - 1):
        for j in range(2, columns):
            temp = board[i][j] + board[i + 1][j - 2] + board[i + 1][j - 1] + board[i + 1][j]
            if temp > maximum:
                maximum = temp
                
    #For 180 degrees rotated counterclockwise L-mino
    for i in range(rows - 2):
        for j in range(columns - 1):
            temp = board[i][j] + board[i][j + 1] + board[i + 1][j + 1] + board[i + 2][j + 1]
            if temp > maximum:
                maximum = temp
                
    #For 270 degrees rotated counterclockwise L-mino
    for i in range(rows - 1):
        for j in range(columns - 2):
            temp = board[i][j] + board[i + 1][j] + board[i][j + 1] + board[i][j + 2]
            if temp > maximum:
                maximum = temp
                
    #For S-mino
    for i in range(1, rows):
        for j in range(columns - 2):
            temp = board[i][j] + board[i][j + 1] + board[i - 1][j + 1] + board[i - 1][j + 2]
            if temp > maximum:
                maximum = temp
                
    #For 90 degrees rotated counterclockwise S-mino
    for i in range(rows - 2):
        for j in range(columns - 1):
            temp = board[i][j] + board[i + 1][j] + board[i + 1][j + 1] + board[i + 2][j + 1]
            if temp > maximum:
                maximum = temp
                
    #For Z-mino
    for i in range(rows - 1):
        for j in range(columns - 2):
            temp = board[i][j] + board[i][j + 1] + board[i + 1][j + 1] + board[i + 1][j + 2]
            if temp > maximum:
                maximum = temp
                
    #For 90 degrees rotated counterclockwise Z-mino
    for i in range(rows - 2):
        for j in range(1, columns):
            temp = board[i][j] + board[i + 1][j] + board[i + 1][j - 1] + board[i + 2][j - 1]
            if temp > maximum:
                maximum = temp
                
    #Returning value    
    return maximum

#Input part
input_list = []
temp = []
N, M = map(int, input().split())
answer = 0

for i in range(N):
    temp = list(map(int, input().split()))
    input_list += [temp]
    temp = []
    
#Applying Algorithm
answer = tetromino(input_list)

#Output part
print(answer)