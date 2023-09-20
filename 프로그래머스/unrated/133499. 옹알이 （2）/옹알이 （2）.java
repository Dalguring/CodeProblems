class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (String s : babbling) {
            int ayaIndex = 0;
            int yeIndex = 0;
            int wooIndex = 0;
            int maIndex = 0;

            if (s.charAt(0) != 'a' && s.charAt(0) != 'y' && s.charAt(0) != 'w' && s.charAt(0) != 'm')
                continue;

            while (s.contains("aya") || s.contains("ye") || s.contains("woo") || s.contains("ma")) {
                if (s.contains("aya")) {
                    ayaIndex = s.indexOf("aya");
                    s = s.replaceFirst("aya", " ");
                    if (ayaIndex == s.indexOf("aya") - 1) {
                        ayaIndex = -1;
                        break;
                    }
                }
                if (s.contains("ye")) {
                    yeIndex = s.indexOf("ye");
                    s = s.replaceFirst("ye", " ");
                    if (yeIndex == s.indexOf("ye") - 1) {
                        yeIndex = -1;
                        break;
                    }
                }
                if (s.contains("woo")) {
                    wooIndex = s.indexOf("woo");
                    s = s.replaceFirst("woo", " ");
                    if (wooIndex == s.indexOf("woo") - 1) {
                        wooIndex = -1;
                        break;
                    }
                }
                if (s.contains("ma")) {
                    maIndex = s.indexOf("ma");
                    s = s.replaceFirst("ma", " ");
                    if (maIndex == s.indexOf("ma") - 1) {
                        maIndex = -1;
                        break;
                    }
                }
            }
            if (ayaIndex == -1 || yeIndex == -1 || wooIndex == -1 || maIndex == -1)
                continue;
            else if (s.trim().length() > 0)
                continue;
            else answer += 1;
        }
        
        return answer;
    }
}