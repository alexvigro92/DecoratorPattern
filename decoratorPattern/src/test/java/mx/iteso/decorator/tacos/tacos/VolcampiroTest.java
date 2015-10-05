package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.TacoNormal;
import mx.iteso.decorator.tacos.Volcampiros;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mavg_ on 10/5/2015.
 */
public class VolcampiroTest {
    @Test
    public void testCost() {
        Taco volcampiros = new Volcampiros();
        assertEquals(16.0, volcampiros.cost(),0);
    }
}
