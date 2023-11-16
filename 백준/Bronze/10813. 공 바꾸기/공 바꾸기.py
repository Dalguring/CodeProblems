import sys

N, M = map(int, sys.stdin.readline().split())

list_ = [i + 1 for i in range(N)]
for i in range(M):
    a, b = map(int, sys.stdin.readline().split())
    list_[a - 1], list_[b - 1] = list_[b - 1], list_[a - 1]

for i in list_:
    print(i, end=' ')