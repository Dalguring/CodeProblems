class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < phone_number.length() - 4; i++)
            sb.append("*");
        
        sb.append(phone_number.substring(phone_number.length() - 4));
        
        return sb.toString();
    }
}