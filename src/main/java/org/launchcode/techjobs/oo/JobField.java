package org.launchcode.techjobs.oo;

public abstract class JobField {
    private final int id;
    private static int nextId = 1;
    private String value;

    // Single constructor
    public JobField(String value) {
        this.id = nextId;
        nextId++;
        this.value = value;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for value
    public String getValue() {
        return value;
    }

    // Setter for value
    public void setValue(String value) {
        this.value = value;
    }
}
