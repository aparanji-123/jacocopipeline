package Jacoco1.jacoco_exp;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {
    	App p=new App();
        assertEquals("Hello Aparanji",p.getMessage("Aparanji"));
    }
    @Test
    public void testNameEmpty()
    {
    	App c=new App();
        assertEquals("Please provide a name!",c.getMessage(" "));
    }
}
