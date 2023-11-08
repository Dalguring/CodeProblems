dices = list(map(int, input().split()))

dices.sort()

if dices.count(dices[1]) == 1:
    print(dices[2] * 100)
elif dices.count(dices[1]) == 2:
    print(dices[1] * 100 + 1000)
else:
    print(dices[1] * 1000 + 10000)