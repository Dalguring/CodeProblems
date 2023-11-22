import sys

N = int(input())
scores = list(map(int, sys.stdin.readline().split()))
maxVal = max(scores)
for i in range(len(scores)):
    scores[i] = scores[i] / maxVal * 100

print(sum(scores) / N)
