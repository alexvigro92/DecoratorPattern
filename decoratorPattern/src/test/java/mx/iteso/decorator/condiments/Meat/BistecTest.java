package mx.iteso.decorator.condiments.Meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.Cebolla;
import mx.iteso.decorator.condiments.meat.Bistec;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;


import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by mavg_ on 10/5/2015.
 */
public class BistecTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco taco1 = new TacoNormal(Taco.MEGA);
        taco1 = new Bistec(taco1);
        assertEquals(12.0, taco1.cost());
        Taco taco2 = new TacoNormal(Taco.JUMBO);
        taco2 = new Bistec(taco2);
        assertEquals(16.0, taco2.cost());
    }
    @Test
    public void testDescription(){
        Taco bistec = new Bistec(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = bistec.getDescription();
        assertEquals("Taco Normal de bistec", desc);
    }
}
