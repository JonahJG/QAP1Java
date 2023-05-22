public class TestTime {
    public static void main(String[] args) {
        // Create two Time objects t1 and t2
        Time t1 = new Time();
        Time t2 = new Time();

        // Set the time for t1 to 21:10:15 using set methods
        t1.setHour(21);
        t1.setMinute(10);
        t1.setSecond(15);

        // Set the time for t2 to 10:20:25 using set methods
        t2.setHour(10);
        t2.setMinute(20);
        t2.setSecond(25);

        // Call nextSecond() for t1
        t1.nextSecond();

        // Call previousSecond() for t2
        t2.previousSecond();

        // Display the final times for t1 and t2 using the toString() method
        System.out.println("t1: " + t1.toString());
        System.out.println("t2: " + t2.toString());
    }
}