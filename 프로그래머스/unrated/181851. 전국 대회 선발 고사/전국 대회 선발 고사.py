def solution(rank, attendance):
    rankArr = []
    rankDict = {}
    for i in range(len(rank)):
        rankDict[rank[i]] = i
        if attendance[i]:
            rankArr.append(rank[i])
            
    rankArr.sort()
    
    return rankDict[rankArr[0]] * 10000 + rankDict[rankArr[1]] * 100 + rankDict[rankArr[2]]