import sys

read = sys.stdin.readline

n = int(input())

array = []
for _ in range(n):
  array.append(int(input()))

array.sort(reverse=True)
maxKg = array[0]

for i in range(1, n):
  maxKg = max(maxKg, (array[i] * (i + 1)))

print(int(maxKg))