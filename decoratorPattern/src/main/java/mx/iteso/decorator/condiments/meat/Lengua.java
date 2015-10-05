package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Lengua  extends CondimentsDecorator {
    Taco taco;

    public Lengua (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de lengua";
    }

    @Override
    public double cost() {
        String size = taco.getSize();
        double precioTam = 2.00;

        if(size.equals(Taco.MINI)){
            precioTam = 1.00;
        }else if(size.equals(Taco.JUMBO)){
            precioTam = 4.00;
        }else if(size.equals(Taco.MEGA)){
            precioTam = 3.00;
        }


        return precioTam + taco.cost();
    }
}
