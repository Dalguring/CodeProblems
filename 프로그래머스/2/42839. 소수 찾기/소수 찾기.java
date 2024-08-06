import java.util.HashSet;
import java.util.Set;

class Solution {
    static boolean[] visited;
    static Set<Integer> primes = new HashSet<>();
    static char[] arr;
    static String target;
    
    public int solution(String numbers) {
        target = numbers;
        visited = new boolean[target.length()];

        for (int i = 1; i <= numbers.length() ; i++) {
            arr = new char[i];
            dfs(0);
        }
        
        return primes.size();
    }
    
    static void dfs(int depth) {
        if (depth == arr.length) {
            StringBuilder sb = new StringBuilder();

            for (char c : arr) {
                sb.append(c);
            }

            if (isPrime(Integer.parseInt(sb.toString()))) {
                primes.add(Integer.parseInt(sb.toString()));
            }

            return;
        }

        for (int i = 0; i < target.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = target.charAt(i);
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
    
}