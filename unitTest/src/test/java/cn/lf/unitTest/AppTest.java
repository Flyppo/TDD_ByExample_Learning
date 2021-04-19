package cn.lf.unitTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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
    	Money five = Money.dollar(5);
    	assertEquals(Money.dollar(10), five.times(2));
    	assertEquals(Money.dollar(15), five.times(3));
    }
    
    @Test
    public void testEquality() {
    	assertTrue(Money.dollar(5).equals(Money.dollar(5)));
    	assertFalse(Money.dollar(5).equals(Money.dollar(6)));
    	assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }
    
    //和testMultiplication的功能重复了，因为现在Dollar和Franc只有currency不一样了
//    @Test
//    public void testFrancMultiplication() {
//    	Money five= Money.franc(5);
//    	assertEquals(Money.franc(10), five.times(2));
//    	assertEquals(Money.franc(15), five.times(3));
//	}
    
    @Test
    public void testCurrency() {
    	assertEquals("USD", Money.dollar(1).currency());
    	assertEquals("CHF", Money.franc(1).currency());
    }
    
    @Test
    public void testSimpleAddition() {
    	Money sum = Money.dollar(5).plus(Money.dollar(5));
    	assertEquals(Money.dollar(10), sum);
    }
}
