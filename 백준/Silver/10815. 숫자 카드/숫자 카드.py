import sys

N = int(sys.stdin.readline())
hasSet = set(map(int, sys.stdin.readline().split()))
M = int(sys.stdin.readline())
compareList = list(map(int, sys.stdin.readline().split()))

for i in compareList:
    if i in hasSet:
        sys.stdout.write('1 ')
    else:
        sys.stdout.write('0 ')