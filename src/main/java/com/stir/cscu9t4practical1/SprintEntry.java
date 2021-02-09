package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {

    protected int rep, rec;
    /**
     * This is the constructor for SprintEntry
     * @param n is the name of the sprint
     * @param d is the day of the sprint
     * @param m is the month of the sprint
     * @param y is the year of the sprint
     * @param h is the hour of the sprint
     * @param min is the minute of the sprint
     * @param s is the second of the sprint
     * @param dist is the distance of the sprint
     * @param rep is repetitions of the sprint
     * @param rec is the recovery of the sprint
     */
    public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int rep, int rec){
        super(n,d,m,y,h,min,s,dist);
        this.rep = rep;
        this.rec = rec;
    }
    /**
     * Gets the entry of the sprint
     * @return a string for a entry message of a sprint
     */
    public String getEntry () {
        String result = getName()+" sprinted " + getRepetitions() + "x" + getDistance()+"m in "
                +getHour()+":"+getMin()+":"+ getSec() + " with "
                +getRecovery()+" minutes recovery on "+getDay()+"/"+getMonth()+"/"+getYear()+"\n";
        return result;
    } //getEntry

    /**
     * Gets the repetitions of the sprint
     * @return an int for the number of repetitions of a sprint
     */
    public int getRepetitions(){
        return rep;
    }//getRepetitions
    /**
     * Sets the repetitions of the sprint
     */
    public void setRepetitions(int r) {
        this.rep = r;
    }//setRepetitions

    /**
     * Gets the recovery of the sprint
     * @return an int for the recovery of a sprint
     */
    public int getRecovery(){
        return rec;
    }//setRecovery
    public void setRecovery(int r) {
        this.rec = r;
    }//setRecovery

}
