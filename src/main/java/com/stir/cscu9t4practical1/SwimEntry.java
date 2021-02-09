package com.stir.cscu9t4practical1;

public class SwimEntry extends Entry{

    protected String where = "";
    /**
     * This is the constructor for SwimEntry
     * @param n is the name of the swim
     * @param d is the day of the swim
     * @param m is the month of the swim
     * @param y is the year of the swim
     * @param h is the hour of the swim
     * @param min is the minute of the swim
     * @param s is the second of the swim
     * @param dist is the distance of the swim
     * @param where is the location of the swim
     */
    public SwimEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String where){
        super(n,d,m,y,h,min,s,dist);
        this.where = where;
    }
    /**
     * Gets the entry of the swim
     * @return a string for a entry message of a swim
     */
    public String getEntry () {
        String result = getName()+" swam " + getDistance() + " km "+getWhere()+" in "
                +getHour()+":"+getMin()+":"+ getSec() + " on "
                +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
        return result;
    } //getEntry
    /**
     * Gets the location of the swim
     * @return an String for the location of a swim
     */
    public String getWhere(){
        return where;
    }
    /**
     * Sets the location of the swim
     */
    public void setWhere(String w){this.where = w;}

}
