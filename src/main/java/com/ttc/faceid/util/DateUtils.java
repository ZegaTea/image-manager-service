package com.ttc.faceid.util;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by tudv on 2019/09/19
 */
public class DateUtils {
    public static final String patternDf = "yyyy-MM-dd";
    public static SimpleDateFormat df = new SimpleDateFormat(patternDf);

    public static Date getDateFromString(String dateString) {
        Date date = null;
        try {
            date = df.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static Time convertTimeString(String time) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Time d = null;
        try {
            d = new Time(dateFormat.parse(time).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return d;
    }

    public String getDateToday() {
        String pt = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pt);
        Calendar calendar = Calendar.getInstance();
        String yesterday = simpleDateFormat.format(calendar.getTime());
        return yesterday;
    }
}
