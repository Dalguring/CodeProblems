import sys

card, maxi = map(int, sys.stdin.readline().split())
cardList = list(map(int, sys.stdin.readline().split()))
maxNum = 0

for i in range(len(cardList) - 2):
    for j in range(i + 1, len(cardList) - 1):
        for k in range(j + 1, len(cardList)):
            if (cardList[i] + cardList[j] + cardList[k]) > maxi:
                continue
            else:
                maxNum = max(maxNum, cardList[i] + cardList[j] + cardList[k])

print(maxNum)