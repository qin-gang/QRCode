package com.nuc.str;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDate {
    public static void main(String[] args) throws Exception{

        Date date = new Date(1000L*3600*24*365*250);


        System.out.println(date);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = dateFormat.format(date);
        System.out.println(format);

        Date parse = dateFormat.parse("2219-11-02 08:00:00");
        System.out.println(parse);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();

    }
}
