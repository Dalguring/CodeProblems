import sys

amount = int(sys.stdin.readline())
total_bought = int(sys.stdin.readline())

for i in range(total_bought):
    price, count = map(int, input().split())
    amount -= price * count

if amount == 0:
    print("Yes")
else:
    print("No")