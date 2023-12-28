def solution(participant, completion):
    playerDict = dict()
    answer = ''

    for player in participant:
        if player in playerDict:
            playerDict[player] += 1
        else:
            playerDict[player] = 1

    for player in completion:
        playerDict[player] -= 1
        if playerDict.get(player) == 0:
            playerDict.pop(player)

    return playerDict.__iter__().__next__()