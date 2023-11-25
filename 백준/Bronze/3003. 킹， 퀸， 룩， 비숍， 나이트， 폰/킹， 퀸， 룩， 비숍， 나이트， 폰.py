import sys

chessInput = list(map(int, sys.stdin.readline().split()))
chessOrigin = [1, 1, 2, 2, 2, 8]

for i in range(len(chessOrigin)):
    print(chessOrigin[i] - chessInput[i], end=" ")