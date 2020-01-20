#Finding minimum moves of knight from start to end
def knight_move(size, start, end):
    #Declaring variables
    queue = []
    visited = []
    distance = []
    temp = []

    #Declaring neighbor spaces
    dr = [-2, -2, -1, -1, 1, 1, 2, 2]
    dc = [-1, 1, -2, 2, -2, 2, -1, 1]
    position = [0, 0]

    #If start and end are equal
    if start == end:
        return 0

    #Making distance list
    for i in range(size):
        for j in range(size):
            temp += [0]
        distance += [temp]
        temp = []

    #Making visited list
    for i in range(size):
        for j in range(size):
            temp += [False]
        visited += [temp]
        temp = []

    #Placing start position to queue
    queue += [start]

    #Making start place visited
    visited[start[0]][start[1]] = True

    #Applying BFS
    while len(queue) != 0:
        #Finding neighbors
        for i in range(8):
            #Finding neighbors
            position[0] = queue[0][0] + dr[i]
            position[1] = queue[0][1] + dc[i]

            #If neighbors are inside the board and not visited
            if position[0] < size and position[0] >= 0 and position[1] < size and position[1] >= 0:
                if visited[position[0]][position[1]] == False:
                    #Adding queue
                    queue += [[position[0], position[1]]]

                    #Setting distance
                    distance[position[0]][position[1]] = distance[queue[0][0]][queue[0][1]] + 1

                    #Making space visited
                    visited[position[0]][position[1]] = True

                    #If the position is end point, end BFS
                    if position[0] == end[0] and position[1] == end[1]:
                        return distance[end[0]][end[1]]

        #Popping queue
        queue.pop(0)

    #Returning value
    return distance[end[0]][end[1]]

#Input part
cases = int(input())
input_temp = []
input_size = []
input_start = []
input_end = []
input_list = []
output_temp = []
output_list = []

for i in range(cases):
    input_size = int(input())
    input_start = list(map(int, input().split()))
    input_end = list(map(int, input().split()))
    input_temp += [input_size]
    input_temp += [input_start]
    input_temp += [input_end]
    input_list += [input_temp]
    input_temp = []

#Applying algorithm
for i in range(cases):
    output_temp += [knight_move(input_list[i][0], input_list[i][1], input_list[i][2])]
    output_list += output_temp
    output_temp = []

#Output part
for i in range(cases):
    print(output_list[i])