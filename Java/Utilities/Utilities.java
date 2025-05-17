package Utilities;

public class Utilities {
    String instance;

    private Utilities(String instance){
        this.instance = instance;
    }

    public static Utilities instance(String instance){
        return new Utilities(instance);
    }

    public DateSupport toDateSupport(){
        return new DateSupport(this.instance);
    }

    public JsonSupport toJsonSupport(){
        return new JsonSupport(this.instance);
    }
}
