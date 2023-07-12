class Solution {
    public int solution(String[] order) {
        int toPay = 0;
        for(String s : order) {
            if(s.contains("cafelatte")) toPay += 5000;
            else if(s.contains("americano")) toPay += 4500;
            else toPay += 4500;
        }
        
        return toPay;
    }
}