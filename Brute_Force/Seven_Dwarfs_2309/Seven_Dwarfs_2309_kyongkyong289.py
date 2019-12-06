def finding_seven_dwarfs(dwarfs_height):
    total_height = 0
    selected_dwarfs = []
    for i in range(9):
        total_height += dwarfs_height[i]
    for i in range(8):
        for j in range(i + 1, 9):
            if total_height - dwarfs_height[i] - dwarfs_height[j] == 100:
                for k in range(9):
                    if k != i and k != j:
                        selected_dwarfs += [dwarfs_height[k]]
    return selected_dwarfs

list_dwarfs = []
temp = []
answer = []

for i in range(9):
    a = int(input())
    temp += [a]
    list_dwarfs += temp
    temp = []

answer = finding_seven_dwarfs(list_dwarfs)
answer.sort()

for i in range(len(answer)):
    print(answer[i])