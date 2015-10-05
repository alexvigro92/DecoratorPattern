package mx.iteso.decorator.condiments.Meat;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.condiments.meat.Lengua;
import mx.iteso.decorator.condiments.meat.Pastor;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by mavg_ on 10/5/2015.
 */
public class PastorTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco taco1 = new TacoNormal(Taco.MINI);
        taco1 = new Pastor(taco1);
        assertEquals(7.0, taco1.cost());
        Taco taco2 = new TacoNormal(Taco.JUMBO);
        taco2 = new Pastor(taco2);
        assertEquals(16.0, taco2.cost());
    }
    @Test
    public void testDescription(){
        Taco pastor = new Pastor(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = pastor.getDescription();
        assertEquals("Taco Normal de pastor", desc);
    }
}
