package Utilities;

public class test {
    public static void main(String[] args) {
        String instance = "20251210";
        String instance2 = "15/01/2026";

        DateSupport date1 = Utilities.instance(instance).toDateSupport().format(Formater.YYYY_MM_DD_WITHOUT_MINUS);


        DateSupport date2 = Utilities.instance(instance2).toDateSupport().format(Formater.YYYY_MM_DD_WITH_SLASH);

        date1 = date1.addDays(15).addMonths(3).addYears(15);
        System.out.println(date1.formatTo(Formater.DD_MMM_YYYY));

        System.out.println(date1.isBefore(date2));
    }
}
