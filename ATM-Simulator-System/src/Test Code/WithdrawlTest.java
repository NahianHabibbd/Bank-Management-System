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
 * @author ifroi
 */
public class WithdrawlTest {
    Withdrawl W;
    @Before
    public void setUp() {
        W= new Withdrawl();
    }

    /**
     * Test of actionPerformed method, of class withD.
     */
    @Test
    public void testWithD() {
        assertEquals(0,W.withD(200, 200));
    }  
}
