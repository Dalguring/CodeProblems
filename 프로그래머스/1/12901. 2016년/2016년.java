class Solution {
    public String solution(int a, int b) {
        int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = 1;
        int days = 0;

        while (month <= a) {
            if (month == a) {
                days += (b - 1);
                break;
            }
            days += monthDays[month - 1];
            month++;
        }

        String[] dayOfWeek = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        
        return dayOfWeek[days % 7];
    }
}