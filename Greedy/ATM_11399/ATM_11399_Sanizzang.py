import sys
input = sys.stdin.readline

n = input()
p = list(map(int, input().split()))

p.sort()

minute = 0
total = 0

for i in p:
  minute += i
  total += minute

print(total)