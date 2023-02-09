import sys
input = sys.stdin.readline

t = int(input())

result=[]

for i in range(t):
  n = int(input())
  rank_list = []
  minRank=1000001
  cnt = 0
  for j in range(n):
    rank_list.append(list(map(int, input().split())))
  rank_list.sort()
  for k in range(n):
    if minRank > rank_list[k][1]:
      minRank = rank_list[k][1]
      cnt += 1
  result.append(cnt)

for i in result:
  print(i)
