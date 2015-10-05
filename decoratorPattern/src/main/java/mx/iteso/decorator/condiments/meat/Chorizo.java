package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Chorizo extends CondimentsDecorator {
    Taco taco;

    public Chorizo(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de chorizo";
    }

    @Override
    public double cost() {
        String size = taco.getSize();
        double precioTam = 0;

        if(size.equals(Taco.MINI)){
            precioTam = 0;
        }else if(size.equals(Taco.JUMBO)){
            precioTam = 4.00;
        }else if(size.equals(Taco.MEGA)){
            precioTam = 2.00;
        }


        return precioTam + taco.cost();
    }
}
