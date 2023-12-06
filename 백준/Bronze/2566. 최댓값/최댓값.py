import sys

max_dict = {}
max_list = []

for i in range(9):
    # max_list.append(max(list(map(int, sys.stdin.readline().split()))))
    list_ = list(map(int, sys.stdin.readline().split()))
    max_list.append(max(list_))
    max_dict[max(list_)] = list_.index(max(list_))

max_list.reverse()
print(max(max_list))
print(8 - max_list.index(max(max_list)) + 1, max_dict.get(max(max_list)) + 1, end=' ')