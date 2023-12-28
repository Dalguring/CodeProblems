def solution(participant, completion):
    playerDict = dict()

    for player in participant:
        playerDict[player] = playerDict.get(player, 0) + 1

    for player in completion:
        playerDict[player] -= 1
        if playerDict.get(player) == 0:
            del playerDict[player]

    return playerDict.__iter__().__next__()