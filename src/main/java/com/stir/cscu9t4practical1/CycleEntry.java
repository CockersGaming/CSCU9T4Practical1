package com.stir.cscu9t4practical1;

public class CycleEntry extends Entry {

    private String terrain = "", tempo = "", activity;

    /**
    * This is the constructor for CycleEntry
    * @param n is the name of the cycle
    * @param d is the day of the cycle
    * @param m is the month of the cycle
    * @param y is the year of the cycle
    * @param h is the hour of the cycle
    * @param min is the minute of the cycle
    * @param s is the second of the cycle
    * @param dist is the distance of the cycle
    * @param ter is terrain of the cycle
    * @param tempo is the tempo of the cycle
    */
    public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String ter, String tempo) {
        super(n,d,m,y,h,min,s,dist);
        this.terrain = ter;
        this.tempo = tempo;
    }

    /**
     * Gets the entry of the cycle
     * @return a string for a entry message of a cycle
     */
    public String getEntry () {
        String result = getName()+" cycled " + getDistance() + " km in "
                +getHour()+":"+getMin()+":"+ getSec() + " on "
                +getDay()+"/"+getMonth()+"/"+getYear()+" on "+getTerrain()+" at "+getTempo()+" tempo\n";
        return result;
    } //getEntry

    /**
     * Gets the terrain of the cycle
     * @return a string for the terrain of the cycle
     */
    public String getTerrain(){
        return terrain;
    } //getTerrain

    /**
     * Sets the terrain of the cycle
     * @param terrain a string for the terrain of this cycle
     */
    public void setTerrain(String terrain) {
        this.terrain = terrain;
    } //setTerrain

    /**
     * Gets the tempo of the cycle
     * @return a string for the tempo of the cycle
     */
    public String getTempo(){
        return tempo;
    } //getTempo

    /**
     * Sets the tempo of the cycle
     * @param tempo a string for the tempo of the cycle
     */
    public void setTempo(String tempo) {
        this.tempo = tempo;
    } //setTempo
}
