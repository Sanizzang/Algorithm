#Depth-First-Search
def dfs(graph, start):
    #Declaring variables
    stack = []
    visited = []
    order = []
    
    #Making all nodes visited false
    for i in range(len(graph)):
        visited += [False]
        
    #Adding starting point to stack
    stack += [start]
    
    #Making visited start point true
    visited[start] = True
    
    #Adding start to order
    order += [start]
    
    #While stack is not empty
    while len(stack) > 0:
        for i in range(len(graph)):
            #If stack's last element and i are connected and i is not visited
            if graph[stack[len(stack) - 1]][i] == 1 and visited[i] == False:
                #Adding i to order
                order += [i]
                
                #Making i visited
                visited[i] = True
                
                #Adding i to stack
                stack += [i]
                
                #Breaking for loop
                break
            
            #If there is no nodes to visit    
            if i == len(graph) - 1:
                #Popping stack
                stack.pop()
                
    #Returning value            
    return order

#Breadth-First-Search
def bfs(graph, start):
    #Declaring variables
    queue = []
    visited = []
    order = []
    
    #Making all nodes visited false
    for i in range(len(graph)):
        visited += [False]
    
    #Adding start to queue
    queue += [start]
    
    #Making start visited
    visited[start] = True
    
    #Adding start to order
    order += [start]
        
    #While queue is not empty
    while len(queue) > 0:
        for i in range(len(graph)):
            #If 0th element of queue and i are connected and i is not visited
            if graph[queue[0]][i] == 1 and visited[i] == False:
                #Adding i to order
                order += [i]
                
                #Making i viisted
                visited[i] = True
                
                #Adding i to queue
                queue += [i]
                
        #Popping queue        
        queue.pop(0)
        
    #Returning value    
    return order

#Making graph
def make_graph(size, connect_list):
    graph = []
    temp = []
    
    for i in range(size + 1):
        for j in range(size + 1):
            temp += [0]
        graph += [temp]
        temp = []
        
    for i in range(len(connect_list)):
        graph[connect_list[i][0]][connect_list[i][1]] = 1
        graph[connect_list[i][1]][connect_list[i][0]] = 1
        
    return graph
    
#Input part    
N, M, V = map(int, input().split())
input_connect_list = []
graph_sample = []
output_list_bfs = []
output_list_dfs = []
input_temp = []

for i in range(M):
    input_temp = list(map(int, input().split()))
    input_connect_list += [input_temp]
    input_temp = []

#Making graph
graph_sample = make_graph(N, input_connect_list)

#Applying algorithm
output_list_dfs = dfs(graph_sample, V)
output_list_bfs = bfs(graph_sample, V)

#Output part
for i in range(len(output_list_dfs)):
    print(output_list_dfs[i], end = ' ')
    
print()

for i in range(len(output_list_bfs)):
    print(output_list_bfs[i], end = ' ')
    
print()
