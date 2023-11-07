tot = input()
array = list(map(int, input().split()))

array.sort()
print(str(array[0]) + ' ' + str(array[len(array) - 1]))