class Solution {
    public int solution(int n, String control) {
        
        for(int i = 0; i < control.length(); i++) {
            switch(control.charAt(i)) {
                case 'w' : n += 1; continue;
                case 's' : n -= 1; continue;
                case 'd' : n += 10; continue;
                case 'a' : n -= 10; continue;
            }
        }
        
        return n;
    }
}