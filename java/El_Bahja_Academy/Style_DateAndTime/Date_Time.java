package El_Bahja_Academy.Style_DateAndTime;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Date_Time {
    public static void main(String[] args){

        Date date1 = new Date();
        System.out.println(date1);

        GregorianCalendar GCTime = new GregorianCalendar(2022,04,22);
        //System.out.println(GCTime.getTime());

        Locale local1 = new Locale("EN" , "MA");
        DateFormat datStyle = DateFormat.getDateInstance(DateFormat.FULL,local1);
        //System.out.println(datStyle.format(GCTime.getTime()));
        System.out.println(datStyle.format(date1));


    }
}
