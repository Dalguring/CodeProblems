import sys

string = sys.stdin.readline().rstrip()
print(1 if string == string[::-1] else 0)