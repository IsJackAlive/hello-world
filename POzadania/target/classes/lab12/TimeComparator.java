package lab12;

import java.util.Comparator;

/**
 *
 * @author roman
 */
public class TimeComparator implements Comparator<Time2> {

    @Override
    public int compare(Time2 time1, Time2 time2) {
        int hourDifference = time1.getHour() - time2.getHour();

        if (hourDifference != 0) {
            return hourDifference;
        }

        int minuteDifference = time1.getMinute() - time2.getMinute();

        if (minuteDifference != 0) {
            return minuteDifference;
        }

        int secondDifference = time1.getSecond() - time2.getSecond();
        return secondDifference;
    }
}

class Time2 {

    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public Time2(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return " hour=" + hour + ", minute=" + minute + ", second=" + second ;
    }

    

}
