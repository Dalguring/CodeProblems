import sys

string = sys.stdin.readline().rstrip()
check = [-1 for i in range(ord('a'), ord('z') + 1)]

for i in range(len(string)):
    check[ord(string[i]) - ord('a')] = string.index(string[i])

print(*check)