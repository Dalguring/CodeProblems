N = int(input())

start = 2
def getDots(dot, target):
    dot = dot * 2 - 1
    target += 1
    if target == N + 1:
        return dot

    return getDots(dot, target)

print(getDots(2, 1) ** 2)