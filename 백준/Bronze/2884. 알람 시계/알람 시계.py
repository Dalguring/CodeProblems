H, M = map(int, input().split())

if M >= 45:
    M -= 45
elif H == 0:
    M = M + 60 - 45
    H = H + 24 - 1
else:
    H -= 1
    M = M + 60 - 45

print(str(H) + ' ' + str(M))