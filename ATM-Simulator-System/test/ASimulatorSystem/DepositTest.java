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
public class DepositTest {
    
    Deposit D;
    
    @Before
    public void setUp() {
        D = new Deposit();
    }
    /**
     * Test of depositedCash method, of class Deposit.
     */
    @Test
    public void testDepositedCash() {
        assertEquals(500,D.depositedCash(250, 250));
    
    }   
}
