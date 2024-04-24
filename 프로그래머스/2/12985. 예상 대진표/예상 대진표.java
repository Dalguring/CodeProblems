class Solution
{
    public int solution(int n, int a, int b)
    {
        int count = 0;
        
        while (a != b) {
            a = makeEven(a) / 2;
            b = makeEven(b) / 2;
            count++;
        }

        return count;
    }
    
    static int makeEven(int number) {
        return number % 2 == 0 ? number : number + 1;
    }
}