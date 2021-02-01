package com.stir.cscu9t4practical1;

public class CycleEntry extends Entry {

    protected String t, tempo = "";

    public CycleEntry(String n, String a, int d, int m, int y, int h, int min, int s, float dist, String t, String tempo) {
        super(n,a,d,m,y,h,min,s,dist);
        this.t = t;
        this.tempo = tempo;
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
        return tempo;
    }
}
