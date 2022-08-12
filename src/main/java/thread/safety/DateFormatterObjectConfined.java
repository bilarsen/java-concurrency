package main.java.thread.safety;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@ThreadSafe
public class DateFormatterObjectConfined {

    @GuardedBy("this")
    private final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public synchronized String format(Date date) {
        return dateFormat.format(date);
    }

    public synchronized Date parse(String date) throws ParseException {
        return dateFormat.parse(date);
    }
}
