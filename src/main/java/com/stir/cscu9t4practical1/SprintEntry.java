package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry {

    protected int rep, res = 0;

    public SprintEntry(String n, String a, int d, int m, int y, int h, int min, int s, float dist, int rep, int res){
        super(n,a,d,m,y,h,min,s,dist);
        this.rep = rep;
        this.res = res;
    }

    public String getEntry () {
        String result = getName()+" sprinted " + getRepetitions() + "x" + getDistance()+"m in "
                +getHour()+":"+getMin()+":"+ getSec() + " with "
                +getRecovery()+" minutes recovery on "+getDay()+"/"+getMonth()+"/"+getYear()+"\n";
        return result;
    } //getEntry

    public int getRepetitions(){
        return rep;
    }

    public int getRecovery(){
        return res;
    }

}
