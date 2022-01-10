public class Date {

    private int day;
    private int month;
    private int year;

//    public int getDay() {
//        return day;
//    }
//
//    public int getMonth() {
//        return month;
//    }
//
//    public int getYear() {
//        return year;
//    }

    public static boolean isValid(int year, int month, int day) {
        if (year < 0) return false;
        if ((month < 1) || (month > 12)) return false;
        if ((day < 1) || (day > 31)) return false;
        switch (month) {
            case 1:
                return true;
            case 2:
                return day <= 29;
            case 3:
                return true;
            case 4:
                return day < 31;
            case 5:
                return true;
            case 6:
                return day < 31;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                return day < 31;
            case 10:
                return true;
            case 11:
                return day < 31;
            default:
                return true;
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(String.valueOf(this.year));
        s.append("-");
        if (this.month < 10) s.append("0");
        s.append(String.valueOf(this.month));
        s.append("-");
        if (this.day < 10) s.append("0");
        s.append(String.valueOf(this.day));
        return s.toString();
    }

    public Date(int year, int month, int day) throws IllegalArgumentException{
        if (!isValid(year, month, day)) throw new IllegalArgumentException();
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Constructor that takes a ISO8601 date string
     * @param dateISO8601
     * @throws IllegalArgumentException if invalid
     */
    public Date(String dateISO8601) throws IllegalArgumentException {
        String[] s = dateISO8601.split("-");
        if (s.length != 3) throw new IllegalArgumentException();
        int yy = Integer.parseInt(s[0]);
        int mm = Integer.parseInt(s[1]);
        int dd = Integer.parseInt(s[2]);
        if (!isValid(yy, mm, dd)) throw new IllegalArgumentException();
        this.year = yy;
        this.month = mm;
        this.day = dd;
    }


}
