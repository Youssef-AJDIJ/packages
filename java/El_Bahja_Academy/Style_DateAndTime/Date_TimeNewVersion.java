package El_Bahja_Academy.Style_DateAndTime;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Date_TimeNewVersion {
    public static void main(String[] args) {
        LocalDateTime local1 = LocalDateTime.now();
        System.out.println(local1);

        //DateTimeFormatter form1 = DateTimeFormatter.ofLocalizedDate(style1);
        DateTimeFormatter form3 = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter form4 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        DateTimeFormatter form5 = DateTimeFormatter.ISO_DATE_TIME;
        //System.out.println(form1.format(local1));
        Locale local0 = new Locale("EN" , "MA");

        //DateTimeFormatter form2 = DateTimeFormatter.ofPattern("dd / MMMM / yyyy ",local0);
        // for specify any style you want to see .

        DateFormat  x = DateFormat.getDateInstance(1,local0);
        LocalDateTime local2 = LocalDateTime.of(2015,11,25,15,20);
        System.out.println(form3.format(local2));
        System.out.println(form4.format(local2));
        System.out.println(form5.format(local2));
        System.out.println(x.format(local2));



    }
}
