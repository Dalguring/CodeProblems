class Solution
{
    public int solution(int n, int a, int b)
    {
        int count = 1;

        while ((a + 1) / 2 != (b + 1) / 2) {
            a = makeEven(a) / 2;
            b = makeEven(b) / 2;
            count++;
        }
        
        // 서로 만나서 붙게 될 때도 라운드 계산을 하므로 + 1
        return count;
    }
    
    static int makeEven(int number) {
        return number % 2 == 0 ? number : number + 1;
    }
}