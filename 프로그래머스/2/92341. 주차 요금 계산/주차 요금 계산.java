import java.io.IOException;
import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Car> carMap = new TreeMap<>();
        StringTokenizer st;

        for (String record : records) {
            st = new StringTokenizer(record);

            String time = st.nextToken();
            int hour = Integer.parseInt(time.split(":")[0].replaceAll("^0", ""));
            int minute = Integer.parseInt(time.split(":")[1].replaceAll("^0", ""));

            String carNumber = st.nextToken();
            String delim = st.nextToken();

            if (delim.equalsIgnoreCase("IN")) {
                if (!carMap.containsKey(carNumber)) {
                    carMap.put(carNumber, new Car(carNumber, hour, minute));
                } else {
                    carMap.get(carNumber).setTime(hour, minute);
                }
            } else {
                carMap.get(carNumber).calcTime(hour, minute);
            }

            carMap.get(carNumber).setInout(delim);
        }

        List<Integer> list = new ArrayList<>();

        for (Car car : carMap.values()) {
            if (car.getInout().equalsIgnoreCase("in")) {
                car.calcTime(23, 59);
                car.setInout("OUT");
            }

            list.add(calcFee(fees, car.getTime()));
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    static int calcFee(int[] fees, int time) {

        if (fees[0] >= time) {
            return fees[1];
        } else {
            return fees[1] + (int) (Math.ceil((time - fees[0]) / (double) fees[2])) * fees[3];
        }
    }
}

class Car {
    private String carNumber;
    private int hour;
    private int minute;
    private int time;
    private String inout;

    public Car(String carNumber, int hour, int minute) {
        this.carNumber = carNumber;
        this.hour = hour;
        this.minute = minute;
    }

    public void calcTime(int hour, int minute) {
        if (minute < this.minute) {
            hour -= 1;
            minute = minute + 60 - this.minute;
            hour -= this.hour;
        } else {
            hour -= this.hour;
            minute -= this.minute;
        }

        time += hour * 60 + minute;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getTime() {
        return this.time;
    }

    public void setInout(String delim) {
        this.inout = delim;
    }

    public String getInout() {
        return this.inout;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carNumber='" + carNumber + '\'' +
                ", hour=" + hour +
                ", minute=" + minute +
                ", time=" + time +
                ", inout='" + inout + '\'' +
                '}';
    }
}