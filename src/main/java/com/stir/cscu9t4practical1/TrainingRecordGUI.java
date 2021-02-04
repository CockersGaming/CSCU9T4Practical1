// GUI and main program for the Training Record
package com.stir.cscu9t4practical1;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;
import java.util.regex.Pattern;

public class TrainingRecordGUI extends JFrame implements ActionListener {

    private JTextField name = new JTextField(30);
    private JTextField day = new JTextField(2);
    private JTextField month = new JTextField(2);
    private JTextField year = new JTextField(4);
    private JTextField hours = new JTextField(2);
    private JTextField mins = new JTextField(2);
    private JTextField secs = new JTextField(2);
    private JTextField dist = new JTextField(4);
    private JLabel labn = new JLabel(" Name:");
    private JLabel labd = new JLabel(" Day:");
    private JLabel labm = new JLabel(" Month:");
    private JLabel laby = new JLabel(" Year:");
    private JLabel labh = new JLabel(" Hours:");
    private JLabel labmm = new JLabel(" Mins:");
    private JLabel labs = new JLabel(" Secs:");
    private JLabel labdist = new JLabel(" Distance (km):");
    private JButton addR = new JButton("Add");
    private JButton lookUpByDate = new JButton("Look Up");
    private JButton FindAllByDate = new JButton("Find All By Date");
    private JButton FindAllByName = new JButton("Find All By Name");
    String[] activityArray = { "run", "cycle", "sprint", "swim"};
    private JComboBox activity = new JComboBox(activityArray);
    private JLabel laba = new JLabel(" Activity:");

    //cycle area
    private JLabel labter = new JLabel(" Terrain: ");
    private JLabel labtem = new JLabel(" Tempo: ");

    String[] tempoArray = { "slow", "moderate", "fast"};
    private JComboBox tempo = new JComboBox(tempoArray);

    String[] terrainArray = { "Asphalt", "Concrete", "Tarmac", "Gravel", "dirt", "cobblestones"};
    private JComboBox terrain = new JComboBox(terrainArray);

    //sprint area
    private JLabel labRep = new JLabel("Repetitions: ");
    private JLabel labRes = new JLabel("Recovery: ");

    private JTextField rep = new JTextField(2);
    private JTextField res = new JTextField(5);

    //swim area
    private JLabel labWhere = new JLabel("Location: ");

    private JTextField where = new JTextField(30);

    private TrainingRecord myAthletes = new TrainingRecord();

    private JTextArea outputArea = new JTextArea(5, 50);

    public static void main(String[] args) {
        TrainingRecordGUI applic = new TrainingRecordGUI();
    } // main

    // set up the GUI 
    public TrainingRecordGUI() {
        super("Training Record");
        setLayout(new FlowLayout());
        add(labn);
        add(name);
        name.setEditable(true);
        add(laba);
        add(activity);
        activity.setEditable(false);
        add(labd);
        add(day);
        day.setEditable(true);
        add(labm);
        add(month);
        month.setEditable(true);
        add(laby);
        add(year);
        year.setEditable(true);
        add(labh);
        add(hours);
        hours.setEditable(true);
        add(labmm);
        add(mins);
        mins.setEditable(true);
        add(labs);
        add(secs);
        secs.setEditable(true);
        add(labdist);
        add(dist);
        dist.setEditable(true);
        add(labter);
        add(terrain);
        terrain.setEditable(false);
        add(labtem);
        add(tempo);
        tempo.setEditable(false);
        add(labRep);
        add(rep);
        rep.setEditable(true);
        add(labRes);
        add(res);
        res.setEditable(true);
        add(labWhere);
        add(where);
        where.setEditable(true);
        add(addR);
        addR.addActionListener(this);
        add(lookUpByDate);
        lookUpByDate.addActionListener(this);
        add(FindAllByDate);
        FindAllByDate.addActionListener(this);
        add(FindAllByName);
        FindAllByName.addActionListener(this);
        add(outputArea);
        outputArea.setEditable(false);
        setSize(720, 200);
        setVisible(true);
        blankDisplay();

        // To save typing in new entries while testing, uncomment
        // the following lines (or add your own test cases)
        
    } // constructor

    // listen for and respond to GUI events 
    public void actionPerformed(ActionEvent event) {
        String message = "";
        if (event.getSource() == addR){
            message = addEntry("generic");
        }
        if (event.getSource() == lookUpByDate){
            message = lookupEntry();
        }
        if (event.getSource() == FindAllByDate){
            message = lookupAllByDate();
        }
        if (event.getSource() == FindAllByName){
            message = lookupAllByName();
        }
        outputArea.setText(message);
        blankDisplay();
    } // actionPerformed

    public String addEntry(String what) {
        String message = "";
        try {
            message = "Record added\n";
            System.out.println("Adding "+what+" entry to the records");
            String n = name.getText();
            String a = String.valueOf(activity.getSelectedItem());
            int m = Integer.parseInt(month.getText());
            int d = Integer.parseInt(day.getText());
            int y = Integer.parseInt(year.getText());
            float km = java.lang.Float.parseFloat(dist.getText());
            int h = Integer.parseInt(hours.getText());
            int mm = Integer.parseInt(mins.getText());
            int s = Integer.parseInt(secs.getText());

            System.out.println(a + "\n" + n + "\n" + m + "\n" + d + "\n" + y + "\n" + km + "\n" + h + "\n" + mm + "\n" + s);

            switch (a) {
                case "run": addRunEntry(n,d,m,y,h,mm,s,km); break;
                case "cycle": addCycleEntry(n,d,m,y,h,mm,s,km,String.valueOf(terrain.getSelectedItem()),String.valueOf(tempo.getSelectedItem())); break;
                case "sprint": addSprintEntry(n,d,m,y,h,mm,s,km,Integer.parseInt(rep.getText()),Integer.parseInt(res.getText())); break;
                case "swim": addSwimEntry(n,d,m,y,h,mm,s,km,where.getText()); break;
            }
            return message;
        } catch (Exception ex){
            System.out.println(ex);
            message = "You haven't entered the date or duration correctly.\nEnsure that you only use Integers i.e. 1, 2, 3, 4, etc...";
            return message;
        }
    }

    private void addRunEntry(String n, int d, int m, int y, int h, int mm, int s, float km){
        //add entry
        Entry e = new Entry(n,d,m,y,h,mm,s,km);
        myAthletes.addEntry(e);
    }

    private void addCycleEntry(String n, int d, int m, int y, int h, int mm, int s, float km, String terr, String tempo){
        //add entry
        Entry e = new CycleEntry(n,d,m,y,h,mm,s,km,terr,tempo);
        myAthletes.addEntry(e);
    }

    private void addSprintEntry(String n, int d, int m, int y, int h, int mm, int s, float km, int rep, int res){
        //add entry
        Entry e = new SprintEntry(n,d,m,y,h,mm,s,km,rep,res);
        myAthletes.addEntry(e);
    }

    private void addSwimEntry(String n, int d, int m, int y, int h, int mm, int s, float km, String w){
        //add entry
        Entry e = new SwimEntry(n,d,m,y,h,mm,s,km,w);
        myAthletes.addEntry(e);
    }

    public String lookupEntry() {
        try {
            int m = Integer.parseInt(month.getText());
            int d = Integer.parseInt(day.getText());
            int y = Integer.parseInt(year.getText());
            outputArea.setText("looking up record ...");
            String message = myAthletes.lookupEntry(d, m, y);
            return message;
        } catch (Exception ex){
            System.out.println(ex);
            String message = "You haven't entered the date correctly.\nEnsure that you only use Integers i.e. 1, 2, 3, 4, etc...";
            return message;
        }
    }

    public String lookupAllByDate(){
        try {
            int m2 = Integer.parseInt(month.getText());
            int d2 = Integer.parseInt(day.getText());
            int y2 = Integer.parseInt(year.getText());
            outputArea.setText("looking up record ...");
            String message = myAthletes.lookupAllByDate(d2, m2, y2);
            return message;
        } catch (Exception ex){
            System.out.println(ex);
            String message = "You haven't entered a valid name or date correctly.\nEnsure that you only use Integers i.e. 1, 2, 3, 4, etc...";
            return message;
        }
    }

    public String lookupAllByName(){
        try {
            String n = name.getText();
            outputArea.setText("looking up record ...");
            String message = myAthletes.lookupAllByName(n);
            return message;
        } catch (Exception ex){
            System.out.println(ex);
            String message = "You haven't entered a valid name or date correctly.\nEnsure that you only use Integers i.e. 1, 2, 3, 4, etc...";
            return message;
        }
    }

    public void blankDisplay() {
        name.setText("");
        activity.setSelectedItem(0);
        day.setText("");
        month.setText("");
        year.setText("");
        hours.setText("");
        mins.setText("");
        secs.setText("");
        dist.setText("");
        terrain.setSelectedItem(0);
        tempo.setSelectedItem(0);
        rep.setText("");
        res.setText("");
        where.setText("");

    }// blankDisplay
    // Fills the input fields on the display for testing purposes only
    public void fillDisplay(Entry ent) {
        name.setText(ent.getName());
        day.setText(String.valueOf(ent.getDay()));
        month.setText(String.valueOf(ent.getMonth()));
        year.setText(String.valueOf(ent.getYear()));
        hours.setText(String.valueOf(ent.getHour()));
        mins.setText(String.valueOf(ent.getMin()));
        secs.setText(String.valueOf(ent.getSec()));
        dist.setText(String.valueOf(ent.getDistance()));
    }

} // TrainingRecordGUI

