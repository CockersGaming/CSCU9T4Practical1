// This class holds information about a single training session
package com.stir.cscu9t4practical1;

import java.util.Calendar;
public class Entry {
  private String name;
  private Calendar dateAndTime;
  private float distance;
  private String tempo, terrain, where;
  private int repetitions, recovery;

  /**
   * This is the constructor for Entry.
   * @param n is the name of the Entry
   * @param d is the day of the Entry
   * @param m is the month of the Entry
   * @param y is the year of the Entry
   * @param h is the hour of the Entry
   * @param min is the minute of the Entry
   * @param s is the second of the Entry
   * @param dist is the distance of the Entry
   */
  public Entry (String n, int d, int m, int y, int h, int min, int s, float dist) {
    name = n;
    Calendar inst = Calendar.getInstance();
    inst.set(y,m-1,d,h,min,s);
    dateAndTime = inst;
    distance = dist;
  } //constructor
  
  public String getName () {
    return name;
  } //getName

  public int getDay () {
    return dateAndTime.get(Calendar.DATE);
  } //getDay
  
  public int getMonth () {
    int month =  dateAndTime.get(Calendar.MONTH) + 1;
    return month;
  } //getMonth
  
  public int getYear () {
    return dateAndTime.get(Calendar.YEAR);
  } //getYear

  public int getHour () {
    return dateAndTime.get(Calendar.HOUR);
  } //getHour

  public int getMin () {
    return dateAndTime.get(Calendar.MINUTE);
  } //getMin

  public int getSec () {
    return dateAndTime.get(Calendar.SECOND);
  } //getSec

  public float getDistance () {
      return distance;
  } //getDistance

  public String getEntry () {
   String result = getName()+" ran " + getDistance() + " km in "
             +getHour()+":"+getMin()+":"+ getSec() + " on "
             +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
   return result;
  } //getEntry

  public String getTerrain() {
    return null;
  }//getTerrain
  public void setTerrain(String t) {
    this.terrain = t;
  }//setTerrain

  public String getTempo() {
    return null;
  }//getTempo
  public void setTempo(String t) {
    this.tempo = t;
  }//setTempo

  public int getRepetitions(){
    return 0;
  }//getRepetitions
  public void setRepetitions(int r) {
    this.repetitions = r;
  }//setRepetitions

  public int getRecovery(){
    return 0;
  }//getRecovery
  public void setRecovery(int r) {
    this.recovery = r;
  }//setRecovery

  public String getWhere(){
    return null;
  }//getWhere
  public void setWhere(String w) {
    this.where = w;
  }//setWhere
} // Entry