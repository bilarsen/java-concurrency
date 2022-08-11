package main.java.thread.safety;

import net.jcip.annotations.ThreadSafe;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Example of a thread confinement
 */
@ThreadSafe
public class DateFormatter {

    private static final ThreadLocal<DateFormat> dateFormatter =
            ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

    public String format(Date date) {
        return dateFormatter.get().format(date);
    }

    public Date parse(String date) throws ParseException {
        return dateFormatter.get().parse(date);
    }
}
