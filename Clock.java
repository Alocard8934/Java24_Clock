package JAVA24;

import java.time.*;
import java.time.temporal.*;

public class Clock {
    public static void main(String[] args) {
        // Determine current time and date
        LocalDateTime now = LocalDateTime.now();
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        int minute = now.get(ChronoField.MINUTE_OF_HOUR);
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        int year = now.get(ChronoField.YEAR);
        
        // Output greeting
        if (hour < 12){
            System.out.println("Good morning! \n");
        } else if(hour < 17){
            System.out.println("Good Day! \n");
        } else {
            System.out.println("Good evening!\n");
        }
        
        // The beginning of the formation of a string that displays the time
        System.out.print("Now ");
        
        // How many hours
        System.out.print(hour);
        System.out.print((hour != 1 & hour != 21) ? " hours (hours)" : " hour ");
        
        // How many minutes
        if(minute != 0){
            System.out.print(minute);
            System.out.print((minute != 1 & minute != 21 & minute != 31 & minute != 41 & minute != 51) ? " minutes " : " minute ");
        }
        
        // Displaying the day of the month
            System.out.print("\n" + day + " ");
            
        // Name of the month
            switch (month) {
                case 1:
                    System.out.print("January");
                    break;
                case 2:
                    System.out.print("February");
                    break;
                case 3:
                    System.out.print("March");
                    break;
                case 4:
                    System.out.print("April");
                    break;
                case 5:
                    System.out.print("May");
                    break;
                case 6:
                    System.out.print("June");
                    break;
                case 7:
                    System.out.print("July");
                    break;
                case 8:
                    System.out.print("August");
                    break;
                case 9:
                    System.out.print("September");
                    break;
                case 10:
                    System.out.print("October");
                    break;
                case 11:
                    System.out.print("November");
                    break;
                case 12:
                    System.out.print("December");
                    break;
            }
            
            // Year display
            System.out.println(", " + year);
    
    }
}
