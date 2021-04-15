package cn.lf.unitTest;

import static org.junit.Assert.assertEquals;
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
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void testMultiplication() {
    	Dollar five= new Dollar(5);
    	System.out.println( "five.amount:" + five.amount );
    	Dollar product= five.times(2);
    	System.out.println( "five.amount after 2 times:" + five.amount );
    	assertEquals(10, product.amount);
    	product= five.times(3);
    	assertEquals(15, product.amount);
    }
}
