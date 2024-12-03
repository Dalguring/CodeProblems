class Solution {
    static int totalLength;
    static int now;
    static int start;
    static int end;
    
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        totalLength = formatToSec(video_len);
        now = formatToSec(pos);
        start = formatToSec(op_start);
        end = formatToSec(op_end);
        setToEnd();

        for (String command : commands) {
            switch (command) {
                case "prev":
                    now -= 10;
                    setDefault();
                    break;
                case "next":
                    now += 10;
                    setLimit();
                    break;
            }
            setToEnd();
        }
        
        return formatToTime();
    }
    
    static int formatToSec(String time) {
        int minToSec = Integer.parseInt(time.split(":")[0]) * 60;
        int sec = Integer.parseInt(time.split(":")[1]);

        return minToSec + sec;
    }

    static String formatToTime() {
        return String.format("%02d:%02d", now / 60, now % 60);
    }

    static void setToEnd() {
        if (now >= start && now <= end) {
            now = end;
        }
    }

    static void setDefault() {
        now = Math.max(now, 0);
    }

    static void setLimit() {
        now = Math.min(now, totalLength);
    }
}