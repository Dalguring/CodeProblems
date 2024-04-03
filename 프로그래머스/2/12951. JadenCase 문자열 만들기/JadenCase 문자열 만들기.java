class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        String[] strArray = s.split("");
        int index = 0;

        for (String str : strArray) {
            if (str.equals(" ")) {
                index = 0;
                sb.append(str);
                continue;
            }
            if (str.matches("[a-zA-Z]") && index == 0) {
                str = str.toUpperCase();
            }
            sb.append(str);
            index++;
        }
        
        return sb.toString();
    }
}