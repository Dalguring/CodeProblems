class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] dbNumbers = new int[numbers.length * 2] ;
        int[] answer = new int[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
            dbNumbers[i] = numbers[i];
            dbNumbers[i+numbers.length] = numbers[i];
        }
        
        switch(direction) {
            case "right" : 
                for(int i = 0; i < answer.length; i++) {
                    answer[i] = dbNumbers[i+answer.length - 1];
                } 
                
                break;
            case "left" : 
                for(int i = 0; i < answer.length - 1; i++) {
                    answer[i] = dbNumbers[i+answer.length + 1];
                }
                
                answer[answer.length - 1] = numbers[0];
                break;
        }
        
        return answer;
    }
}