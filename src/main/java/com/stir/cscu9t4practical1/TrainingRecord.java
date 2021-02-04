// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;

import java.util.*;

public class TrainingRecord {
    private List<Entry> tr;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e){
       tr.add(e);    
   } // addClass
   
   // look up the entry of a given day and month
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       StringBuilder result=new StringBuilder(""); //1
        while (iter.hasNext()) {
            Entry current = iter.next();
            if (current.getDay()==d && current.getMonth()==m && current.getYear()==y)
                result.append(current.getEntry() + " ");
        }
        return result.toString();
   } // lookupEntry

    public String lookupAllByDate (int d, int m, int y) {
        ListIterator<Entry> iter = tr.listIterator();
        StringBuilder result=new StringBuilder(""); //create a StringBuilder to concatenate a string with entries on that date
        while (iter.hasNext()) {
            Entry current = iter.next();
            if (current.getDay() == d && current.getMonth() == m && current.getYear() == y)
                result.append(current.getEntry()+" ");
        }
        //2
        if(result.equals("")){
            result.append("No entires found");
        }
        return result.toString();
    }

   // Count the number of entries
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
   }
   
} // TrainingRecord