import sys

list_ = [int(sys.stdin.readline()) for i in range(1, 10)]

print(max(list_))
print(list_.index(max(list_)) + 1)