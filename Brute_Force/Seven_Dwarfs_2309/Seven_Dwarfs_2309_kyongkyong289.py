#Picking seven dwarfs which sum of height is 100
def picking_seven_dwarfs(heights_dwarf):
    is_picked = []
    picked_dwarfs = []
    height_sum = 0
    
    #For all possibilities of selection which has 2 ^ 9 = 512 cases
    for i in range(1, 2 ** 9 + 1):
        #is_picked is list of picked dwarfs [1, 1, 0, 1] means 1st, 3rd, 4th dwarfs are selected/
        is_picked = binary_list_change(i, 9)
        
        #If seven dwarfs are selected
        if sum(is_picked) == 7:
            for j in range(9):
                #If certain dwarf is selected
                if is_picked[j] == 1:
                    #Then add height of dwarf and adding dwarf to list 
                    picked_dwarfs += [heights_dwarf[j]]
                    height_sum += heights_dwarf[j]
                    
            #If sum of height is 100 return list
            if height_sum == 100:
                return picked_dwarfs
            
            #If is not, then reset picked dwarfs and sum of height
            picked_dwarfs = []
            height_sum = 0

#This function is about changing n to binary numbers of k digits
def binary_list_change(n, k):
    binary_list = []

    #Algorithm part of making binary number
    while n > 1:
        binary_list += [n % 2]
        n = n // 2
    binary_list += [1]
    
    #Making k digits
    while len(binary_list) < k:
        binary_list += [0]

    return binary_list

#Declaring variables
heights = []
temp = []
answer = []

#Input part
for i in range(9):
    a = int(input())
    temp += [a]
    heights += temp
    temp = []

#Getting answer and sorting answer
answer = picking_seven_dwarfs(heights)
answer.sort()

#Output part
for i in range(len(answer)):
    print(answer[i])