package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField{

    private int id;
    private static int nextId = 1; // changing value is not stored in any employer object //
    private String value;

    public Employer() {
        id = nextId;
        nextId++;
    }
    // Every new employer object will get a unique number now after this constructor //
    public Employer(String value) {
        this();
        this.value = value;
    }
// this() is a placeholder for the variable id making this a default behavior //
    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
