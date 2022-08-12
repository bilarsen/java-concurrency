package main.java.thread.safety;

import net.jcip.annotations.NotThreadSafe;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@NotThreadSafe
public class DateFormatter {

    private final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public String format(Date date) {
        return dateFormat.format(date);
    }

    public Date parse(String date) throws ParseException {
        return dateFormat.parse(date);
    }
}
