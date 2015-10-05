package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

/**
 * Created by mavg_ on 10/1/2015.
 */
public class Volcampiros extends Taco {
    public Volcampiros(){
        description = "Volcampiro";
    }

    @Override
    public double cost() {
        return 16.00;
    }
}
