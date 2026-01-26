public class MyDate {
    /* This private data member holds the calculated Julian number for this MyDate */
    private final int julianNumber;

    /* If no arguments were provided then default the date January 1st, 1970 (epoch time). */
    public MyDate(){
        // Using the day/month/year constructor logic
        this.julianNumber = toJulianNumber(1, 1, 1970);
    }

    /* Creates a new MyDate from an existing MyDate */
    public MyDate(MyDate date){
        this.julianNumber = date.julianNumber;
    }

    /* Creates a new MyDate from a day, month, and year */
    public MyDate(int day, int month, int year){
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12. Provided: " + month);
        }
        this.julianNumber = toJulianNumber(day, month, year);
    }

    /* Returns the day of the month for this MyDate */
    public int getDay(){
        return fromJulianNumber()[0];
    }

    /* Returns the month of the year for this MyDate */
    public int getMonth(){
        return fromJulianNumber()[1];
    }

    /* Returns the year for this MyDate */
    public int getYear(){
        return fromJulianNumber()[2];
    }

    /* Returns true if this MyDate represents a date in a leap year */
    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getLastDayOfMonth(int month, int year){
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    /* * Uses JulianDateConvertor to calculate the number.
     * Note: We call the converter's method here.
     */
    private static int toJulianNumber(int day, int month, int year){
        JulianDateConvertor converter = new JulianDateConvertor(day, month, year);
        return converter.convertDateToJulian();
    }

    /* * Uses JulianDateConvertor to unpack the julianNumber into day, month, year
     */
    private int[] fromJulianNumber(){
        JulianDateConvertor converter = new JulianDateConvertor(this.julianNumber);
        String dateStr = converter.convertJulianToDate(); // Returns "DD-MM-YYYY"

        // Split the string and parse back to integers
        String[] parts = dateStr.split("-");
        int d = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int y = Integer.parseInt(parts[2]);

        return new int[]{d, m, y};
    }
}
