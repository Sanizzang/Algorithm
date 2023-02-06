import sys

read = sys.stdin.readline

n = int(input())
distance = list(map(int, input().split()))
oilCost = list(map(int, input().split()))

expense = 0
minCost = oilCost[0]

for i in range(n - 1):
    if minCost < oilCost[i]:
        expense += minCost * distance[i]
    else:
        minCost = oilCost[i]
        expense += minCost * distance[i]

print(expense)
