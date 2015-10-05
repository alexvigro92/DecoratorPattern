package mx.iteso.decorator;

public abstract class Taco {
    public String description = "Any Taco";
    public String size = REGULAR;

    public final static String MINI = "mini";
    public final static String REGULAR = "regular";
    public final static String MEGA = "mega";
    public final static String JUMBO = "jumbo";

    public String getDescription(){
        return description;
    }

    public String getSize(){
        return size;
    }

    public abstract double cost();
}
