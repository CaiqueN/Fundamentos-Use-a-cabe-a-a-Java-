package org.example;

public class Overloads {

    String uniqueID;

    public int addName(int a, int b){
        return a + b;
    }

    public double addName(double a , double b){
        return a + b;
    }

    public void setUniqueID(String theID){
        uniqueID = theID;
    }

    public void setUniqueID(int ssNumber){
        String numString = "" + ssNumber;
        setUniqueID(numString);
    }
}
