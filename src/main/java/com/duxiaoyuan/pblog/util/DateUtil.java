package com.duxiaoyuan.pblog.util;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author duxiaoyuan
 * Date Utils
 */
public class DateUtil {
    public static String getCurrentDate(String dateFormat){
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateFormat);
        return  dateTime.format(formatter);
    }

    public static String formatDate(Date dateTime, String dateFormat){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);

        return simpleDateFormat.format(dateTime);
    }
}
