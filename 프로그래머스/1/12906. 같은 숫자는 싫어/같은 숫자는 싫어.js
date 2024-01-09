function solution(arr)
{
    var answer = [];
    arr.forEach(i => {
        if (answer.length == 0 || answer[answer.length - 1] != i) {
            answer.push(i);
        }
    })
    
    return answer;
}