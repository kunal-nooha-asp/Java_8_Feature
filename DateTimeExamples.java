import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeExamples {
    
    public static void main(String args[])
    {
        LocalDate today= LocalDate.now();
        LocalDate birthdDate= LocalDate.of(2004, 9, 9);
        System.out.println(birthdDate);
        System.out.println(today);

        LocalDate nextWeek = today.plusWeeks(1);
        LocalDate lastmonth=today.minusMonths(1);
        System.out.println("Next Week  "+nextWeek);
        System.out.println("Last Month  "+lastmonth);


        // Local Time 
        LocalTime nowtime= LocalTime.now();
        System.out.println(nowtime);

        LocalTime meeting = LocalTime.of(14,30);
        System.out.println("Meeting TIme is  : "+meeting);


        //Local Date And Time

        LocalDateTime nowDT= LocalDateTime.now();
        System.out.println(nowDT);
        LocalDateTime projectDeadline=nowDT.plusDays(10).withHour(23).withMinute(59);
        System.out.println("Project Dead Line is   " +projectDeadline);
        // Formating Date and TIme

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy   hh-mm");
        String fromated = projectDeadline.format(formatter);
        System.out.println("Formatted DealLing  "+fromated);
    }
}

