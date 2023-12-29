import sys

N = int(sys.stdin.readline())
hasSet = set(map(int, sys.stdin.readline().split()))
M = int(sys.stdin.readline())
compareSet = list(map(int, sys.stdin.readline().split()))

for i in range(len(compareSet)):
    if compareSet[i] in hasSet:
        print(1, end=" ")
    else:
        print(0, end=" ")