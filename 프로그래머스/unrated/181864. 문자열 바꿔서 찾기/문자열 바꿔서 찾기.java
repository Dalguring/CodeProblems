class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder(myString);
        for (int i = 0; i < myString.length(); i++) {
            switch (sb.charAt(i)) {
                case 'A' : sb.replace(i, i + 1, "B"); break;
                case 'B' : sb.replace(i, i + 1, "A"); break;
            }
        }
        
        return sb.toString().contains(pat) ? 1 : 0;
    }
}