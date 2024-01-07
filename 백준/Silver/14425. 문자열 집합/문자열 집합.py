import sys

N, M = map(int, sys.stdin.readline().split())
targetList = []
totalSet = set()
count = 0

for i in range(N):
    totalSet.add(sys.stdin.readline().rstrip())

for i in range(M):
    targetList.append(sys.stdin.readline().rstrip())

for i in range(M):
    if totalSet.__contains__(targetList[i]):
        count += 1

print(count)