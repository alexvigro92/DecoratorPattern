package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;
import org.jdom.IllegalNameException;

/**
 * Created by mavg_ on 10/1/2015.
 */
public class Shrimp extends CondimentsDecorator {
    Taco taco;

    public Shrimp(Taco taco){

            this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de camaron";
    }

    @Override
    public double cost() {
        String size = taco.getSize();
        double precioTam = 0;

        if(size.equals(Taco.JUMBO)){
            precioTam = 10.00;
        }else if(size.equals(Taco.MEGA)){
            precioTam = 8.00;
        }

        return precioTam + taco.cost();
    }
}