/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASimulatorSystem;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class WithdrawlTest {
    
    Withdrawl  w;
    
    @Before
    public void setUp() {
        w = new Withdrawl();
    }

    
    /**
     * Test of main method, of class Withdrawl.
     */
    @Test
    public void testWithdrawnCalulate() {
        assertEquals(400,w.Calculate(700,300));
    }
    
}
