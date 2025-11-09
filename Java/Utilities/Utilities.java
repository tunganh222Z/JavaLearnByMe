package Utilities;

import java.util.Date;

public class Utilities {
    String instance;

    private Utilities(String instance){
        this.instance = instance;
    }

    public static Utilities instance(String instance){
        return new Utilities(instance);
    }

    public static DateSupport instance(Date instance){
        return new DateSupport(instance);
    }

    public DateSupport toDateSupport(){
        return new DateSupport(this.instance);
    }

    public JsonSupport toJsonSupport(){
        return new JsonSupport(this.instance);
    }

    public static void main(String[] args) {
        String dateString = "20251012";
        Date vkl = new Date();
        String res = Utilities.instance(dateString).toDateSupport().format(Formater.YYYY_MM_DD_WITHOUT_MINUS).addMonths(12).formatTo(Formater.YYYY_MM_DD_WITH_SLASH);
        System.out.println(res);
    }
}
