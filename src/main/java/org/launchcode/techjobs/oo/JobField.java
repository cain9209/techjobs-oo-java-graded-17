package org.launchcode.techjobs.oo;

public abstract class JobField {
    public int id;
    private static int nextId = 1;
    private String value;

    public JobField(){
        id = nextId;
        nextId++;
    }

    @Override
    public String toString() {
        return value;
    }




}
