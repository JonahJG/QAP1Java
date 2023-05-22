public class Time {

    // Instance variables 
    int hour;      
    int minute;     
    int second;    

    // Getter methods to retrieve the hour, minute, and second
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Setter methods to set the hour, minute, and second
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // Method to set the time with provided hour, minute, and second values
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Method to advance the time by one second and return the updated Time instance
    public Time nextSecond() {
        second++;
        if (second == 60) {     // If seconds reach 60, reset to 0 and increment the minute
            second = 0;
            minute++;
            if (minute == 60) {     // If minutes reach 60, reset to 0 and increment the hour
                minute = 0;
                hour++;
                if (hour == 24) {   // If hours reach 24, reset to 0
                    hour = 0;
                }
            }
        }
        return this;
    }

    // Method to decrement the time by one second and return the updated Time instance
    public Time previousSecond() {
        second--;
        if (second == -1) {     // If seconds reach -1, reset to 59 and decrement the minute
            second = 59;
            minute--;
            if (minute == -1) {     // If minutes reach -1, reset to 59 and decrement the hour
                minute = 59;
                hour--;
                if (hour == -1) {   // If hours reach -1, reset to 23
                    hour = 23;
                }
            }
        }
        return this;
    }

    // Method to format the time as a string in the format "hh:mm:ss"
    public String toString() {
        String hourString = String.format("%02d", hour);       // Format the hour with leading zeros
        String minuteString = String.format("%02d", minute);   // Format the minute with leading zeros
        String secondString = String.format("%02d", second);   // Format the second with leading zeros
        return hourString + ":" + minuteString + ":" + secondString;    // Return the formatted time as a string
    }
}
