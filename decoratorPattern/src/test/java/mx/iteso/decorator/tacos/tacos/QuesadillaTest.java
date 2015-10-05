package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mavg_ on 10/5/2015.
 */
public class QuesadillaTest {
    @Test
    public void testCost() {
        Taco quesadilla = new Quesadilla(Taco.MEGA);
        assertEquals(12.0, quesadilla.cost(),0);
        Taco quesadilla1 = new Quesadilla(Taco.JUMBO);
        assertEquals(14.0, quesadilla1.cost(),0);
        Taco quesadilla2 = new Quesadilla(Taco.MINI);
        assertEquals(9.0, quesadilla2.cost(),0);
    }
}
