def solution(num_list):
    odd = ''
    even = ''
    
    for i in num_list:
        if(i % 2 != 0):
            odd += str(i)
        else:
            even += str(i)
    
    return int(odd) + int(even)