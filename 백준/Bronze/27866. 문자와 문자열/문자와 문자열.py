import sys

word = sys.stdin.readline()
location = int(sys.stdin.readline())

print(word[location - 1: location])