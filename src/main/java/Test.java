public class Test {

    public static void main(String[] args) {

//            // get today
//            Date today = new Date();
//            System.out.println(today.toString());

            // tomorrow
            Date tomorrow = new Date("2014-05-09");
            //System.out.println(today.compareTo(tomorrow)); // today is earlier than tomorrow

            // yesterday
            Date yesterday = new Date(2014, 5, 7);
            //System.out.println(today.compareTo(yesterday)); // today is NOT earlier than tomorrow

            // 2013 is not leap year
            //System.out.println(Date.isLeap(2013) ? "2013 is leap": "2013 is not leap");

            // 2013-1-31 is a valid date
            System.out.println(Date.isValid(2013, 1, 31));

            // 2014 - 2 - 29 is not valid and will throw IllegalArgumentException
            Date invalid = new Date(2014, 2, 29); // throws exception
            System.out.println(invalid.toString());
        }

}
