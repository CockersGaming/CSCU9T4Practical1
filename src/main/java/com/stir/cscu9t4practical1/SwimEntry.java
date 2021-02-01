package com.stir.cscu9t4practical1;

public class SwimEntry extends Entry{

    protected String where = "";

    public SwimEntry(String n, String a, int d, int m, int y, int h, int min, int s, float dist, String where){
        super(n,a,d,m,y,h,min,s,dist);
        this.where = where;
    }

    public String getEntry () {
        String result = getName()+" swam " + getDistance() + " km "+getWhere()+" in "
                +getHour()+":"+getMin()+":"+ getSec() + " on "
                +getDay()+"/"+getMonth()+"/"+getYear()+"\n";
        return result;
    } //getEntry

    public String getWhere(){
        return where;
    }

}
