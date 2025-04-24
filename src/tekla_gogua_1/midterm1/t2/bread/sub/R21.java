package tekla_gogua_1.midterm1.t2.bread.sub;

import tekla_gogua_1.midterm1.t2.bread.A21;
import tekla_gogua_1.midterm1.t2.bowl.bass.A22;

public class R21 {
    public static void main(String[] args) {
        A21 rectangle = new A21();
        A22 monthInfo = new A22();
        
        // Calculate area
        int area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Rectangle area: " + area);
        
        // Get month name
        String monthName = switch(monthInfo.getMonth()) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
        System.out.println("Month name: " + monthName);
    }
}
