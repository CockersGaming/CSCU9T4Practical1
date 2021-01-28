package com.stir.cscu9t4practical1;

public class CycleEntry extends Entry {

    protected String t, sp = "";

    public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String t, String sp) {
        super(n, d, m, y, h, min, s, dist);
        this.t = t;
        this.sp = sp;
    }

    public String getEntry () {
        String result = getName()+" cycled " + getDistance() + " km in "
                +getHour()+":"+getMin()+":"+ getSec() + " on "
                +getDay()+"/"+getMonth()+"/"+getYear()+" on "+getTerrain()+" at "+getTempo()+" tempo\n";
        return result;
    } //getEntry

    public String getTerrain(){
        return t;
    }

    public String getTempo(){
        return sp;
    }
}
