#Comparing with chess board which starts in BWBWBWBW
def compare_bw(board, start_row, start_column):
    difference_count = 0
    for i in range(start_row, start_row + 8):
        for j in range(start_column, start_column + 8):
            #If the board is not B (supposed to be B)
            if (i + j) % 2 == 0:
                if board[i][j] != 'B':
                    difference_count += 1
                    
            #If the board is not W (supposed to be W)
            if (i + j) % 2 == 1:
                if board[i][j] != 'W':
                    difference_count += 1
    return difference_count

#Comparing with chess board which starts in WBWBWBWB
def compare_wb(board, start_row, start_column):
    difference_count = 0
    for i in range(start_row, start_row + 8):
        for j in range(start_column, start_column + 8):
            #If the board is not W (supposed to be W)
            if (i + j) % 2 == 0:
                if board[i][j] != 'W':
                    difference_count += 1
                    
            #If the board is not B (supposed to be B)
            if (i + j) % 2 == 1:
                if board[i][j] != 'B':
                    difference_count += 1
    return difference_count    

#Finding least differences
def least_differences(board, rows, columns):
    least_difference = 0
    for i in range(rows - 7):
        for j in range(columns - 7):
            #Initializing least difference
            if i == 0 and j == 0:
                least_difference = compare_bw(board, i, j)
            #Updating least difference if lower value occured
            if compare_bw(board, i, j) < least_difference:
                least_difference = compare_bw(board, i, j)
            if compare_wb(board, i, j) < least_difference:
                least_difference = compare_wb(board, i, j)
    return least_difference
            
#This is input part
M, N = map(int, input().split())
board_test = []
temp = []
for i in range(M):
    string_temp = input()
    temp = list(string_temp)
    board_test += [temp]
    
print(least_differences(board_test, M, N))