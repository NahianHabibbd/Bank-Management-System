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
public class TranscationsTest {
    Transcations T;
    
    @Before
    public void setUp() {
        T = new Transcations();
    }

    /**
     * Test of actionPerformed method, of class trans.
     */
    @Test
    public void testTrans() {
        assertEquals(500, T.trans(100, 200, 200) );
    }   
}
