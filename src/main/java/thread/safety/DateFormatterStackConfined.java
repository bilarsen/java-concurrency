package main.java.thread.safety;

import net.jcip.annotations.ThreadSafe;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@ThreadSafe
public class DateFormatterStackConfined {

    public String format(Date date) {
        return createSimpleDateFormat().format(date);
    }

    public Date parse(String date) throws ParseException {
        return createSimpleDateFormat().parse(date);
    }

    private static SimpleDateFormat createSimpleDateFormat() {
        return new SimpleDateFormat("yyyy-MM-dd");
    }
}
