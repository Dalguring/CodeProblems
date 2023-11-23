import sys

T = int(input())
str_list = []
for i in range(T):
    string = sys.stdin.readline()
    str_list.append(string[0] + string[len(string.rstrip()) - 1])

print('\n'.join(str_list))