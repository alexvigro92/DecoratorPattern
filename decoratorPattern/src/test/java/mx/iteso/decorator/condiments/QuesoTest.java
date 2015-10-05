package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by mavg_ on 10/5/2015.
 */
public class QuesoTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCost() {
        Taco taco2 = new TacoNormal(Taco.MINI);
        Taco queso = new Queso(taco2);
        assertEquals(8.0, queso.cost());
        Taco taco1 = new TacoNormal(Taco.JUMBO);
        Taco queso1 = new Queso(taco1);
        assertEquals(18.0, queso1.cost());
    }

    @Test
    public void testDescription(){
        Taco queso = new Queso(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = queso.getDescription();
        assertEquals("Taco Normal con queso", desc);
    }
}
