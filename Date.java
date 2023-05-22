public class Date {

    // Instance variables
    public int day; 
    public int month;
    public int year;
    
    // Constructor to initialize the Date object with provided day, month, and year values
    public Date(int day, int month, int year) {
        // Ensure day is within the range [1, 31]
        this.day = Math.max(1, Math.min(day, 31));
        
        // Ensure month is within the range [1, 12]
        this.month = Math.max(1, Math.min(month, 12));
        
        // Ensure year is within the range [1900, 9999]
        this.year = Math.max(1900, Math.min(year, 9999)); 
    }

    // Getter for day
    public int getDay() {
        return day;
    }

    // Getter for month
    public int getMonth() {
        return month;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for day
    public void setDay(int day) {
        this.day = day;
    }

    // Setter for month
    public void setMonth(int month) {
        this.month = month;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }

    // Method to set the date with the provided day, month, and year values
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Method to return the date as a formatted string in the "dd/mm/yyyy" format
    public String toString() {
        String dayString = String.format("%02d", day);     // Format the day with leading zeros
        String monthString = String.format("%02d", month); // Format the month with leading zeros
        return dayString + "/" + monthString + "/" + year; // Return the formatted string
    }
}
