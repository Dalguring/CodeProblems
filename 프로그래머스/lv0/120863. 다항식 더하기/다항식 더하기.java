class Solution {
    public String solution(String polynomial) {
        String[] strings = polynomial.split(" \\+ ");
        int containX = 0;
        int number = 0;

        for(String s : strings) {
            if(s.contains("x")) {
                if(s.equals("x"))
                    containX += 1;
                else
                    containX += Integer.parseInt(s.substring(0, s.indexOf("x")));
            } else
                number += Integer.parseInt(s);
        }
        
        StringBuilder sb = new StringBuilder();
        if(containX == 0) {
            sb.append(number);
        } else if(containX == 1 && number == 0) {
            sb.append("x");
        } else if(containX == 1 && number != 0) {
            sb.append("x + " + number);
        } else if(number == 0) {
            sb.append(containX + "x");
        } else {
            sb.append(containX + "x + " + number);
        }
        
        return sb.toString();
    }
}