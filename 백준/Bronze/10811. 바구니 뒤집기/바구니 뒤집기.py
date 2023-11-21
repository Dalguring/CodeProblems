import sys

N, M = map(int, sys.stdin.readline().split())
bucket = [index for index in range(1, N + 1)]

for i in range(M):
    pt1, pt2 = map(int, sys.stdin.readline().split())
    tempArr = bucket[pt1 - 1: pt2]
    tempArr.reverse()
    bucket[pt1 - 1: pt2] = tempArr

for elem in bucket:
    print(elem, end=" ")