class Solution {
    static final StringBuilder sb = new StringBuilder();
    static String myHand;
    static int leftHand = 10;
    static int rightHand = 12;
    
    public String solution(int[] numbers, String hand) {
        myHand = hand.equals("left") ? "L" : "R";
        
        for (int number : numbers) {
            getHand(number);
        }
        
        return sb.toString();
    }
    
    static void getHand(int number) {
        if (number == 0) {
            number = 11;
        }

        if (number % 3 == 0) {
            sb.append("R");
            rightHand = number;
        } else if (number == 1 || number == 4 || number == 7) {
            sb.append("L");
            leftHand = number;
        } else {
            int leftControl = 0;
            int rightControl = 0;

            leftControl += Math.abs(leftHand - number) / 3;
            leftControl += Math.abs(leftHand - number) % 3;
            rightControl += Math.abs(rightHand - number) / 3;
            rightControl += Math.abs(rightHand - number) % 3;

            if (leftControl == rightControl) {
                sb.append(myHand);

                if (myHand.equals("L")) {
                    leftHand = number;
                } else {
                    rightHand = number;
                }
            } else {
                sb.append(leftControl < rightControl ? "L" : "R");

                if (leftControl < rightControl) {
                    leftHand = number;
                } else {
                    rightHand = number;
                }
            }
        }
    }
}