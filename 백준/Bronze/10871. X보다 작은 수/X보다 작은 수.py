import sys
N, X = map(int, sys.stdin.readline().split())
arr = list(map(int, sys.stdin.readline().split()))
arr2 = []

for num in arr:
    if num < X:
        arr2.append(num)

for num in arr2:
    print("%d" % num, end=" ")
