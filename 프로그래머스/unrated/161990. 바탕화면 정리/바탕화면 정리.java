class Solution {
    public int[] solution(String[] wallpaper) {
        int xMax = Integer.MIN_VALUE;
        int xMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;
        int index = 0;

        for(String s : wallpaper) {
            if(s.contains("#")) {
                xMin = Math.min(xMin, index);
                xMax = Math.max(xMax, index);
                yMin = Math.min(yMin, s.indexOf("#"));
                yMax = Math.max(yMax, s.lastIndexOf("#"));
            }
            index++;
        }

        xMax += 1;
        yMax += 1;

        return new int[]{xMin, yMin, xMax, yMax};
    }
}