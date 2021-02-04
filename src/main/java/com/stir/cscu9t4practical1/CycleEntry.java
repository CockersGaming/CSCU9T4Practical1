package com.stir.cscu9t4practical1;

public class CycleEntry extends Entry {

    private String ter = "", tempo = "", activity;

    public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String ter, String tempo) {
        super(n,d,m,y,h,min,s,dist);
        this.ter = ter;
        this.tempo = tempo;
    }

    public String getEntry () {
        String result = getName()+" cycled " + getDistance() + " km in "
                +getHour()+":"+getMin()+":"+ getSec() + " on "
                +getDay()+"/"+getMonth()+"/"+getYear()+" on "+getTerrain()+" at "+getTempo()+" tempo\n";
        return result;
    } //getEntry

    public String getTerrain(){
        return ter;
    }

    public String getTempo(){
        return tempo;
    }
}
