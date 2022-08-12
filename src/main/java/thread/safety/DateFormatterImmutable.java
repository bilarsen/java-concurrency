package main.java.thread.safety;

import net.jcip.annotations.ThreadSafe;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@ThreadSafe
public class DateFormatterImmutable {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ISO_LOCAL_DATE;

    public String format(LocalDate date) {
        return DATE_TIME_FORMATTER.format(date);
    }

    public LocalDate parse(String date) {
        return LocalDate.parse(date, DATE_TIME_FORMATTER);
    }
}
