import sys

report = [False for i in range(30)]
for i in range(28):
    present = int(sys.stdin.readline())
    report[present - 1] = True

print(report.index(False) + 1)
report[report.index(False)] = True
print(report.index(False) + 1)