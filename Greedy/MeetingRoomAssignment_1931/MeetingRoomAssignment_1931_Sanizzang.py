import sys
input = sys.stdin.readline

n = int(input())

meetingList = []
for i in range(n):
    meetingList.append(list(map(int, input().split())))

meetingList.sort()

minFinishTime = meetingList[0][1]
count = 0

for i in range(1, n):
    if minFinishTime <= meetingList[i][0]:
        count += 1
        minFinishTime = meetingList[i][1]
    else:
        if minFinishTime > meetingList[i][1]:
            minFinishTime = meetingList[i][1]

print(count + 1)
