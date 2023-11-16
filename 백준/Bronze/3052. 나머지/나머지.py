import sys

set_ = set()
for i in range(10):
    set_.add(int(sys.stdin.readline()) % 42)

print(len(set_))