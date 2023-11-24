import sys

T = int(sys.stdin.readline())

for i in range(T):
    repeat, string = map(str, sys.stdin.readline().split())
    for letter in string:
        print(letter * int(repeat), end="")
    print()