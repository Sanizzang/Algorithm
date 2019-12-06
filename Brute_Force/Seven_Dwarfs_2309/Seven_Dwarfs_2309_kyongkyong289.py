def picking_seven_dwarfs(heights_dwarf):
    is_picked = []
    picked_dwarfs = []
    height_sum = 0
    
    for i in range(1, 2 ** 9 + 1):
        is_picked = binary_list_change(i, 9)
        if sum(is_picked) == 7:
            for j in range(9):
                if is_picked[j] == 1:
                    picked_dwarfs += [heights_dwarf[j]]
                    height_sum += heights_dwarf[j]
            if height_sum == 100:
                return picked_dwarfs
            picked_dwarfs = []
            height_sum = 0
            
def binary_list_change(n, k):
    binary_list = []
    binary_list_reverse = []
    while n > 1:
        binary_list += [n % 2]
        n = n // 2
    binary_list += [1]
    
    while len(binary_list) < k:
        binary_list += [0]

    return binary_list

heights = []
temp = []
answer = []

for i in range(9):
    a = int(input())
    temp += [a]
    heights += temp
    temp = []
    
answer = picking_seven_dwarfs(heights)
answer.sort()

for i in range(len(answer)):
    print(answer[i])