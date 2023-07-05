class Solution {
    public int solution(String binomial) {
        switch(binomial.split(" ")[1]) {
            case "+" : return Integer.parseInt(binomial.split(" ")[0])
                            + Integer.parseInt(binomial.split(" ")[2]);
            case "-" : return Integer.parseInt(binomial.split(" ")[0])
                            - Integer.parseInt(binomial.split(" ")[2]);
            case "*" : return Integer.parseInt(binomial.split(" ")[0])
                            * Integer.parseInt(binomial.split(" ")[2]);
        }
        
        return 0;
    }
}