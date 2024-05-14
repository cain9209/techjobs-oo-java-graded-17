package org.launchcode.techjobs.oo;

public abstract class JobField {
    public int id;
    private static int nextId = 1;
    private String value;

    public JobField(){
        id = nextId;
        nextId++;
    }
    public String toString() {
        return value;
    }

    public int getId() {
        return getId();
    }

    public String getName() {
        return getName();
    }

    public Employer getEmployer() {
        return getEmployer();
    }

    public Location getLocation() {
        return getLocation();
    }

    public PositionType getPositionType() {
        return getPositionType();
    }

    public CoreCompetency getCoreCompetency() {
        return getCoreCompetency();
    }

    public void setName(String name) {
        name = getName();
    }

    public void setEmployer(Employer employer) {
        employer = getEmployer();
    }

    public void setLocation(Location location) {
        location = getLocation();
    }

    public void setPositionType(PositionType positionType) {
        positionType = getPositionType();
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        coreCompetency = getCoreCompetency();
    }




}
