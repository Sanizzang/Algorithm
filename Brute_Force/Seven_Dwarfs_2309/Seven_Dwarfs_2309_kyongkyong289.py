#Function which finds seven dwarfs
def finding_seven_dwarfs(dwarfs_height):
    #Declaring total height
    total_height = 0

    #Declaring Selected dwarfs
    selected_dwarfs = []

    #Adding nine dwarfs' height
    for i in range(9):
        total_height += dwarfs_height[i]

    #Deselecting two dwarfs
    for i in range(8):
        for j in range(i + 1, 9):
            #If Seven Dwarfs' sum of height is 100
            if total_height - dwarfs_height[i] - dwarfs_height[j] == 100:
                
                #Then select all except of two deselected dwarfs
                for k in range(9):
                    if k != i and k != j:
                        selected_dwarfs += [dwarfs_height[k]]
    return selected_dwarfs

#Declaring variables
list_dwarfs = []
temp = []
answer = []

#Input part
for i in range(9):
    a = int(input())
    temp += [a]
    list_dwarfs += temp
    temp = []

#Output part
answer = finding_seven_dwarfs(list_dwarfs)
answer.sort()

for i in range(len(answer)):
    print(answer[i])