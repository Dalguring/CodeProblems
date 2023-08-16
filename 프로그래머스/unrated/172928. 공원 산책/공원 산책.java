class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] start = new int[2];
        for(int i = 0; i < park.length; i++) {
            if(park[i].contains("S")) {
                start[0] = i;
                start[1] = park[i].indexOf("S");
                break;
            }
        }

        for(int i = 0; i < routes.length; i++) {
            int move = Integer.parseInt(routes[i].split(" ")[1]);
            switch (routes[i].split(" ")[0]) {
                case "N":
                    String nStr = "";
                    if(start[0] - move >= 0) {
                        for (int j = start[0] - 1; j >= start[0] - move; j--)
                            nStr += park[j].charAt(start[1]);
                    } else break;

                    if(nStr.contains("X")) 
                        break;
                    else start[0] -= move;
                    break;
                case "S":
                    String sStr = "";
                    if(start[0] + move < park.length) {
                        for (int j = start[0] + 1; j <= start[0] + move; j++)
                            sStr += park[j].charAt(start[1]);
                    } else continue;

                    if(sStr.contains("X")) 
                        continue;
                    else start[0] += move;
                    break;
                case "W":
                    if(start[1] - move < 0 || park[start[0]].substring(start[1] - move, start[1]).contains("X"))
                        continue;
                    else start[1] -= move;
                    break;
                case "E":
                    if(start[1] + move >= park[start[0]].length() || park[start[0]].substring(start[1] + 1, start[1] + move + 1).contains("X"))
                        continue;
                    else start[1] += move;
                    break;
            }
        }
        
        return start;
    }
}