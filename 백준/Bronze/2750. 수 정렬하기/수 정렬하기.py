number = int(input())
numbs = []
for i in range(number):
    numbs.append(int(input()))

numbs.sort()
for i in numbs:
    print(i)