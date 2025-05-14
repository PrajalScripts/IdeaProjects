package DateAndTimeApi;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocateDateAndTime {
    public LocateDateAndTime(LocalDate of) {
        
    }

    public static void main(String[] args) {
        LocalDate date= LocalDate.now();
        LocalTime time= LocalTime.now();
       LocalDate time2= LocalDate.parse("2025-03-30");
        System.out.println(date);
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getYear());
        System.out.println(time);
        System.out.println(time2);
    // FOR LOCAL DATE TIME BOTH TOGETHER
        LocalDateTime dateTime= LocalDateTime.now();
        System.out.println("current date time is :"+ dateTime);

        System.out.println("--------------");

        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));


        System.out.println("---------------");
        System.out.println(ZoneId.systemDefault());
    }
}
