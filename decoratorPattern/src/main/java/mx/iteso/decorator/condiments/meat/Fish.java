package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

/**
 * Created by mavg_ on 10/1/2015.
 */
public class Fish extends CondimentsDecorator {
    Taco taco;

    public Fish(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de pescado";
    }

    @Override
    public double cost() {
        String size = taco.getSize();
        double precioTam = 0;

        if(size.equals(Taco.JUMBO)){
            precioTam = 8.00;
        }else if(size.equals(Taco.MEGA)){
            precioTam = 6.00;
        }

        return precioTam + taco.cost();
    }
}