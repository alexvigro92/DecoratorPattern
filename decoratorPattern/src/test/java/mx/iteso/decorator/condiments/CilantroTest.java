package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by mavg_ on 10/5/2015.
 */
public class CilantroTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost(){
        Taco cilantro = new Cilantro(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = cilantro.cost();
        assertEquals(8.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco cinaltro = new Cilantro(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = cinaltro.getDescription();
        assertEquals("Taco Normal con cilantro", desc);
    }
}

