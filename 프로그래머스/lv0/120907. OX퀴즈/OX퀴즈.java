class Solution {
    public String[] solution(String[] quiz) {
        StringBuilder sb = new StringBuilder();
        for(String s : quiz) {
            int first = Integer.parseInt(s.split(" ")[0]);
            String operator = s.split(" ")[1];
            int second = Integer.parseInt(s.split(" ")[2]);
            int third = Integer.parseInt(s.split(" ")[4]);

            if(operator.equals("+")) {
                if(first + second == third)
                    sb.append("O ");
                else
                    sb.append("X ");
            } else {
                if(first - second == third)
                    sb.append("O ");
                else
                    sb.append("X ");
            }
        }
        
        return sb.toString().trim().split(" ");
    }
}