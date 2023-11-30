import sys

chars = list(sys.stdin.readline().rstrip().upper())
dict_ = {}

for char in chars:
    dict_[char] = dict_.get(char) + 1 if dict_.get(char) is not None else 1

dict_ = sorted(dict_.items(), key=lambda item:item[1], reverse=True)

print(dict_[0][0] if len(dict_) == 1 else '?' if dict_[0][1] == dict_[1][1] else dict_[0][0])