package mx.iteso.decorator.condiments.Meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.meat.Chorizo;
import mx.iteso.decorator.condiments.meat.Fish;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by mavg_ on 10/5/2015.
 */
public class FishTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco taco1 = new TacoNormal(Taco.JUMBO);
        taco1 = new Fish(taco1);
        assertEquals(20.0, taco1.cost());
    }
    @Test
    public void testDescription(){
        Taco fish = new Fish(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = fish.getDescription();
        assertEquals("Taco Normal de pescado", desc);
    }
}
