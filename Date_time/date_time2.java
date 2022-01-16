package Date_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class date_time2 {
    public static void main(String[] args) {
        LocalDateTime dt1 = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(dtf.format(dt1));
        System.out.println(dt1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        System.out.println(dt1.plusDays(2));
        System.out.println(LocalTime.now().minusHours(3));
        System.out.println(Duration.ofMinutes(10).getSeconds());

        LocalTime Start = LocalTime.of(11, 40, 50);
        LocalTime end = LocalTime.of(11, 42, 50);

        Duration duration = Duration.between(Start, end);

        System.out.println("Seconds: " + duration.getSeconds());

        LocalDate Startdate = LocalDate.of(1950, 9, 1);
        LocalDate enddate = LocalDate.of(2010, 9, 2);
        Period period = Period.between(Startdate, enddate);

        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());

    }

}