package Utilities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateSupport {
    private String instance;
    private Date date;
    private Calendar calendar = Calendar.getInstance();

    DateSupport(String instance){
        this.instance = instance;
    }

    public String formatTo(String formatDateTime){
        if (this.date == null) {
            throw new IllegalStateException("You must call format() before formatTo()");
        }

        DateFormat dateFormat = new SimpleDateFormat(formatDateTime);
        return dateFormat.format(date);
    }

    public DateSupport format(String formatDateTime) {
        DateFormat df = new SimpleDateFormat(formatDateTime);
        try {
            date = df.parse(instance);
        } catch (ParseException pe){
            throw new IllegalArgumentException("Invalid instance date format " + instance);
        }
        calendar.setTime(this.date);
        return this;
    }

    public DateSupport addDays (int days){
        calendar.add(Calendar.DAY_OF_MONTH, days);
        this.date = calendar.getTime();
        return this;
    }

    public DateSupport addMonths (int months){
        calendar.add(Calendar.MONTH, months);
        this.date = calendar.getTime();
        return this;
    }

    public DateSupport addYears(int years){
        calendar.add(Calendar.YEAR, years);
        this.date = calendar.getTime();
        return this;
    }

    public void subtractDays (int days){}
    public void daysBetween (DateSupport otherDate){}

    public boolean isBefore (DateSupport otherDate){
        return this.date.before(otherDate.date);
    }

    public boolean isAfter (DateSupport otherDate){
        return this.date.after(otherDate.date);
    }

    public void getDayOfWeek(DateSupport date){}
    public String toString(String patter){
        return null;
    }

}
