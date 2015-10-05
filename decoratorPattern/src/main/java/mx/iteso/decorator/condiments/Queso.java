package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Queso extends CondimentsDecorator {
    Taco taco;

    public Queso(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con queso";
    }

    @Override
    public double cost() {
            String size = taco.getSize();
            double precioTam = 2.00;

        if(size.equals(Taco.MINI)){
            precioTam = 1.00;
        }else if(size.equals(Taco.JUMBO)){
            precioTam = 6.00;
        }else if(size.equals(Taco.MEGA)){
            precioTam = 4.00;
        }


        return precioTam + taco.cost();
    }
}
