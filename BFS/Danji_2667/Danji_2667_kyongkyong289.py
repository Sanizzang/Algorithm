def danji(board):
    visited = []
    temp = []
    num_of_houses = []
    temp_list = []
    num_of_danji = 0

    for i in range(len(board)):
        for j in range(len(board[0])):
            temp += [False]

        visited += [temp]
        temp = []

    for i in range(len(visited)):
        for j in range(len(visited[0])):
            if visited[i][j] == False and board[i][j] == 1:
                num_of_danji += 1
                temp_list = danji_search(board, visited, i, j)
                visited = temp_list[0]
                num_of_houses += [temp_list[1]]

    num_of_houses = bubble_sort(num_of_houses)

    return [num_of_danji] + num_of_houses

def danji_search(board1, board2, row, column):
    dr = [-1, 0, 0, 1]
    dc = [0, -1, 1, 0]

    queue = []
    queue += [[row, column]]
    board2[row][column] = True
    houses = 1

    while len(queue) > 0:
        for i in range(4):
            if queue[0][0] + dr[i] < len(board1) and queue[0][0] + dr[i] >= 0 and queue[0][1] + dc[i] < len(board1) and queue[0][1] + dc[i] >= 0: 
                if board1[queue[0][0] + dr[i]][queue[0][1] + dc[i]] == 1 and board2[queue[0][0] + dr[i]][queue[0][1] + dc[i]] == False:
                    queue += [[queue[0][0] + dr[i], queue[0][1] + dc[i]]]
                    board2[queue[0][0] + dr[i]][queue[0][1] + dc[i]] = True
                    houses += 1

        queue.pop(0)

    return [board2, houses]

def bubble_sort(target_list):
    temp = 0

    for i in range(len(target_list) - 1):
        for j in range(len(target_list) - 1):
            if target_list[j] > target_list[j + 1]:
                temp = target_list[j]
                target_list[j] = target_list[j + 1]
                target_list[j + 1] = temp

    return target_list

N = int(input())
temp = ''
temp_list = []
input_list = []
output_list = []

for i in range(N):
    temp = input()
    for j in range(N):
        temp_list += [int(temp[j])]
    input_list += [temp_list]
    temp_list = []

output_list = danji(input_list)

for i in range(len(output_list)):
    print(output_list[i])
