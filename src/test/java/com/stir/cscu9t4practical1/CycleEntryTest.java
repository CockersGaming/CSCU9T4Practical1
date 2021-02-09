/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stir.cscu9t4practical1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author saemundur
 */
public class CycleEntryTest {
    
    public CycleEntryTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getName method, of class CycleEntry.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Entry instance = new CycleEntry("Alice",1, 2, 2003, 0, 16, 7, 3F, "asphalt", "moderate");
        String expResult = "Alice";
        String result = instance.getName();
        assertEquals(expResult, result);

        Entry instance2 = new CycleEntry("Matt",1, 2, 2003, 0, 16, 7, 3F, "asphalt", "moderate");
        String expResult2 = "Matt";
        String result2 = instance2.getName();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of getDay method, of class CycleEntry.
     */
    @Test
    public void testGetDay() {
        System.out.println("getDay");
        Entry instance = new CycleEntry("Alice",1, 2, 2003, 0, 16, 7, 3F, "gravel", "moderate");
        int expResult = 1;
        int result1 = instance.getDay();
        assertEquals(expResult, result1);

        Entry instance2 = new CycleEntry("Alice",19, 2, 2003, 0, 16, 7, 3F, "gravel", "moderate");
        int expResult2 = 19;
        int result2 = instance2.getDay();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of getMonth method, of class CycleEntry.
     */
    @Test
    public void testGetMonth() {
        System.out.println("getMonth");
        Entry instance = new CycleEntry("Alice",1, 2, 2003, 0, 16, 7, 3F, "mountain", "fast");
        int expResult = 2;
        int result = instance.getMonth();
        assertEquals(expResult, result);

        Entry instance2 = new CycleEntry("Alice",1, 12, 2003, 0, 16, 7, 3F, "mountain", "fast");
        int expResult2 = 12;
        int result2 = instance2.getMonth();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of getYear method, of class CycleEntry.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        Entry instance = new CycleEntry("Alice",1, 2, 2003, 0, 16, 7, 3F, "gravel", "slow");
        int expResult = 2003;
        int result = instance.getYear();
        assertEquals(expResult, result);

        Entry instance2 = new CycleEntry("Alice",1, 2, 1987, 0, 16, 7, 3F, "gravel", "slow");
        int expResult2 = 1987;
        int result2 = instance2.getYear();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of getHour method, of class CycleEntry.
     */
    @Test
    public void testGetHour() {
        System.out.println("getHour");
        Entry instance = new CycleEntry("Alice",1, 2, 2003, 0, 16, 7, 3F, "asphalt", "fast");
        int expResult = 0;
        int result = instance.getHour();
        assertEquals(expResult, result);

        Entry instance2 = new CycleEntry("Alice",1, 2, 2003, 5, 16, 7, 3F, "asphalt", "fast");
        int expResult2 = 5;
        int result2 = instance2.getHour();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of getMin method, of class CycleEntry.
     */
    @Test
    public void testGetMin() {
        System.out.println("getMin");
        Entry instance = new CycleEntry("Alice",1, 2, 2003, 0, 16, 7, 3F, "asphalt", "moderate");
        int expResult = 16;
        int result = instance.getMin();
        assertEquals(expResult, result);

        Entry instance2 = new CycleEntry("Alice",1, 2, 2003, 0, 51, 7, 3F, "asphalt", "moderate");
        int expResult2 = 51;
        int result2 = instance2.getMin();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of getSec method, of class CycleEntry.
     */
    @Test
    public void testGetSec() {
        System.out.println("getSec");
        Entry instance = new CycleEntry("Alice",1, 2, 2003, 0, 16, 7, 3F, "asphalt", "moderate");
        int expResult = 7;
        int result = instance.getSec();
        assertEquals(expResult, result);

        Entry instance2 = new CycleEntry("Alice",1, 2, 2003, 0, 16, 18, 3F, "asphalt", "moderate");
        int expResult2 = 18;
        int result2 = instance2.getSec();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of getDistance method, of class CycleEntry.
     */
    @Test
    public void testGetDistance() {
        System.out.println("getDistance");
        Entry instance = new CycleEntry("Alice",1, 2, 2003, 0, 16, 7, 3F, "asphalt", "moderate");
        float expResult = 3.0F;
        float result = instance.getDistance();
        assertEquals(expResult, result);

        Entry instance2 = new CycleEntry("Alice",1, 2, 2003, 0, 16, 7, 5.56F, "asphalt", "moderate");
        float expResult2 = 5.56F;
        float result2 = instance2.getDistance();
        assertEquals(expResult2, result2);
    }
    
    /**
     * Test of getTerrain method, of class CycleEntry.
     */
    @Test
    public void testGetTerrain() {
        System.out.println("getTerrain");
        Entry instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3F, "asphalt", "moderate");
        String expResult = "asphalt";
        String result = instance.getTerrain();
        assertEquals(expResult, result);

        Entry instance2 = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3F, "dirt", "moderate");
        String expResult2 = "dirt";
        String result2 = instance2.getTerrain();

        assertEquals(expResult2, result2);
    }

    /**
     * Test of setTerrain method, of class CycleEntry.
     */
    @Test
    public void testSetTerrain(){
        System.out.println("setTerrain");
        Entry instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        String expResult = "asphalt";
        instance.setTerrain("asphalt");
        String result = instance.getTerrain();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTempo method, of class CycleEntry.
     */
    @Test
    public void testGetTempo() {
        System.out.println("getTempo");
        Entry instance = new CycleEntry("Alice",1, 2, 2003, 0, 16, 7, 3F, "asphalt", "moderate");
        String expResult = "moderate";
        String result = instance.getTempo();
        assertEquals(expResult, result);

        Entry instance2 = new CycleEntry("Alice",1, 2, 2003, 0, 16, 7, 3F, "asphalt", "slow");
        String expResult2 = "slow";
        String result2 = instance2.getTempo();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of setTempo method, of class CycleEntry.
     */
    @Test
    public void testSetTempo(){
        System.out.println("setTempo");
        Entry instance = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        String expResult = "moderate";
        instance.setTerrain("moderate");
        String result = instance.getTempo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEntry method, of class CycleEntry.
     */
    @Test
    public void testGetEntry() {
        System.out.println("getEntry");
        Entry instance = new CycleEntry("Alice",1, 2, 2003, 0, 16, 7, 3F, "asphalt", "moderate");
        String expResult = "Alice cycled 3.0 km in 0:16:7 on 1/2/2003 on asphalt at moderate tempo\n";
        String result = instance.getEntry();
        assertEquals(expResult, result);

        Entry instance2 = new CycleEntry("Jack",14, 10, 2019, 0, 1, 26, 0.5F, "gravel", "fast");
        String expResult2 = "Jack cycled 0.5 km in 0:1:26 on 14/10/2019 on gravel at fast tempo\n";
        String result2 = instance2.getEntry();
        assertEquals(expResult2, result2);

    }
    
}