package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class TacoNormal extends Taco {
    public TacoNormal(String size){
        this.size = size;
        description = "Taco normal";
    }

    private TacoNormal(){}

    @Override
    public double cost() {
        String size = getSize();
        double cost = 8.00;

        if(size.equals(Taco.MINI)){
            cost -= 1.00;
        }else if(size.equals(Taco.MEGA)){
            cost += 2.00;
        }else if(size.equals(Taco.JUMBO)){
            cost += 4.00;
        }

        return cost;
    }
}
