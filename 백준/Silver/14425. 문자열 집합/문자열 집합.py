import sys

N, M = map(int, sys.stdin.readline().split())
totalSet = set()
count = 0

for i in range(N):
    totalSet.add(sys.stdin.readline().rstrip())

for i in range(M):
    if totalSet.__contains__(sys.stdin.readline().rstrip()):
        count += 1

print(count)