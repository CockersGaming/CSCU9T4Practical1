/*
 * Test class for TrainingRecordGUI
 * It is not finished as we're not expecting you to implement GUI testing
 * However, you're welcome to use this starter template and extend it and add
 * test for public methods you implement in TrainingRecordGUI.java
 */
package com.stir.cscu9t4practical1;

import java.awt.event.ActionEvent;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
// Only used if you want to use reflection to test private features
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JButton;




/**
 *
 * @author saemundur
 */
public class TrainingRecordGUITest {

    public TrainingRecordGUITest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of main method, of class TrainingRecordGUI.
     * just tests if the class can be initialised without errors
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TrainingRecordGUI.main(args);
    }

    /**
     * Test of actionPerformed method, of class TrainingRecordGUI.
     * This doesn't test anything but might be used in evaluations
     */
    @Test
    public void testActionPerformed() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("Action not performed");
    }

    /**
     * Test of blankDisplay method, of class TrainingRecordGUI.
     * It just executes the method to see if it doesn't throw an exception
     */
    @Test
    public void testBlankDisplay() {
        System.out.println("blankDisplay");
        TrainingRecordGUI instance = new TrainingRecordGUI();
        instance.blankDisplay();
    }
    
    /**
     * Test of addEntry method, of class TrainingRecordGUI
     * 
     */
    @Test
    public void testAddEntry(){
        System.out.println("addEntry");
        TrainingRecordGUI instance = new TrainingRecordGUI();

        Entry entry = new Entry("Alice",1, 2, 2003, 0, 16, 7, 3);
        instance.fillDisplay(entry,1);
        String message = instance.addEntry("generic");
        System.out.println(message);
        assertEquals(message,"Record added\n");

        Entry entry1 = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        instance.fillDisplay(entry1,2);
        String message1 = instance.addEntry("generic");
        System.out.println(message1);
        assertEquals(message1,"Record added\n");

        Entry entry2 = new SprintEntry("Alice",1, 2, 2003, 0, 16, 7, 300, 10, 2);
        instance.fillDisplay(entry2,3);
        String message2 = instance.addEntry("generic");
        System.out.println(message2);
        assertEquals(message2,"Record added\n");

        Entry entry3 = new SwimEntry("Alice",1, 2, 2003, 0, 16, 7, 3F,"pool");
        instance.fillDisplay(entry3,4);
        String message3 = instance.addEntry("generic");
        System.out.println(message3);
        assertEquals(message3,"Record added\n");
    }

    /**
     * Test of lookupEntry method, of class TrainingRecordGUI
     *
     */
    @Test
    public void testLookupEntry() {
        System.out.println("lookupEntry");
        TrainingRecordGUI instance = new TrainingRecordGUI();

        Entry entry = new Entry("Alice",15,12,2020, 0, 16, 7, 3);
        instance.setDropDownValue(1);
        instance.fillDisplay(entry, 1);
        String message = instance.addEntry("generic");
        System.out.println(message);
        assertEquals(message,"Record added\n");

        Entry entry1 = new CycleEntry("Jack", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        instance.setDropDownValue(2);
        instance.fillDisplay(entry1, 2);
        String message1 = instance.addEntry("generic");
        System.out.println(message1);
        assertEquals(message1,"Record added\n");

        Entry entry2 = new SprintEntry("Mac",15,12,2020, 0, 16, 7, 300, 10, 2);
        instance.setDropDownValue(3);
        instance.fillDisplay(entry2, 3);
        String message2 = instance.addEntry("generic");
        System.out.println(message2);
        assertEquals(message2,"Record added\n");

        Entry entry3 = new SwimEntry("Nick",1, 2, 2003, 0, 16, 7, 3F,"outdoors");
        instance.setDropDownValue(4);
        instance.fillDisplay(entry3, 4);
        String message3 = instance.addEntry("generic");
        System.out.println(message3);
        assertEquals(message3,"Record added\n");

        // Find Alice and Mac.
        instance.fillDisplay(entry, 1);
        String findMessageDuplicate = instance.lookupEntry();
        System.out.println(findMessageDuplicate);
        assertEquals("Alice swam 10.34 km outdoors in 3:12:7 on 15/12/2020\nMac swam 10.34 km outdoors in 3:12:7 on 15/12/2020\n",findMessageDuplicate);

        // Find Mac.
        instance.fillDisplay(entry2, 3);
        String findMessage = instance.lookupEntry();
        System.out.println(findMessage);
        assertEquals("Mac sprinted 4x12m in 3:4:5 with 5 minutes recovery on 1/2/2021\n",findMessage);

        // Find Nick.
        instance.fillDisplay(entry2, 3);
        String findMessage2 = instance.lookupEntry();
        System.out.println(findMessage2);
        assertEquals("Nick cycled 30.78 km in 5:3:2 on 2/3/2021 on asphalt at moderate tempo\n",findMessage2);

        // Find no entries.
        instance.fillDisplay(new SwimEntry("Nick",1, 2, 2003, 0, 16, 7, 3F,"outdoors"), 4);
        String findMessage4 = instance.lookupEntry();
        System.out.println(findMessage4);
        assertEquals("No entries found...",findMessage4);
    }

    /**
     * Test of lookUpAllByDate method, of class TrainingRecordGUI
     *
     */
    @Test
    public void testLookUpAllByDate() {
        System.out.println("lookUpAllByDate");
        TrainingRecordGUI instance = new TrainingRecordGUI();

        Entry entry = new Entry("Alice",1, 2, 2003, 0, 16, 7, 3);
        instance.setDropDownValue(1);
        instance.fillDisplay(entry, 1);
        String message = instance.addEntry("generic");
        System.out.println(message);
        assertEquals(message,"Record added\n");

        Entry entry1 = new CycleEntry("Alice", 1, 2, 2003, 0, 16, 7, 3, "asphalt", "moderate");
        instance.setDropDownValue(2);
        instance.fillDisplay(entry1, 2);
        String message1 = instance.addEntry("generic");
        System.out.println(message1);
        assertEquals(message1,"Record added\n");

        Entry entry2 = new SprintEntry("Alice",1, 2, 2003, 0, 16, 7, 300, 10, 2);
        instance.setDropDownValue(3);
        instance.fillDisplay(entry2, 3);
        String message2 = instance.addEntry("generic");
        System.out.println(message2);
        assertEquals(message2,"Record added\n");

        Entry entry3 = new SwimEntry("Alice",1, 2, 2003, 0, 16, 7, 3F,"outdoors");
        instance.setDropDownValue(4);
        instance.fillDisplay(entry3, 4);
        String message3 = instance.addEntry("generic");
        System.out.println(message3);
        assertEquals(message3,"Record added\n");
    }

    /**
     * Test to see if all display requirements have been met
     */
    @Test
    public void testButtonsPresentInGUI() throws IllegalAccessException, IllegalArgumentException{
        System.out.println("Check if you have added the buttons"); 
        TrainingRecordGUI instance = new TrainingRecordGUI();
        Class<?> instanceClass = instance.getClass();
        String[] expectedFields = {"addR","lookUpByDate","FindAllByDate","FindAllByName", "remove"}; // add RemoveEntry when it is ready
        Field fields[] = instanceClass.getDeclaredFields();
        int found = 0;
        for (Field field : fields) {
            if (Arrays.asList(expectedFields).contains(field.getName())){
                found += 1;
                field.setAccessible(true);
                assertTrue(field.get(instance) instanceof JButton);
            }
        }
        assertEquals(found,expectedFields.length,"Have you added all required buttons?");
    }
}
