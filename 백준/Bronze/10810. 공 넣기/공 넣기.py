import sys

N, M = map(int, sys.stdin.readline().split())

list_ = [0 for i in range(N)]
for i in range(M):
    a, b, c = map(int, sys.stdin.readline().split())
    for j in range(a - 1, b):
        list_[j] = c

for i in list_:
    print(i, end=" ")