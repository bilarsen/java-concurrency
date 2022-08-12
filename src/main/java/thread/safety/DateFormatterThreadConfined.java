package main.java.thread.safety;

import net.jcip.annotations.ThreadSafe;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@ThreadSafe
public class DateFormatterThreadConfined {

    private static final ThreadLocal<DateFormat> DATE_FORMAT =
            ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM" + "-dd"));

    public String format(Date date) {
        return DATE_FORMAT.get().format(date);
    }

    public Date parse(String date) throws ParseException {
        return DATE_FORMAT.get().parse(date);
    }
}
