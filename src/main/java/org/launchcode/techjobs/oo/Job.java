package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job extends JobField{

    private final int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
// We use this constructor to create a unique ID //
//    public Job() {
//        id = nextId;
//        nextId++;
//    }
    public Job(){
        super("");
        this.id = nextId++;
    }
// for the love of god make sure you call the empty constructor lol, save 30 min next time lol //
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name; // not an object //
        this.employer = employer; // objects need .toStringMethods and or .to...Methods //
        this.location = location; // objects need .toStringMethods and or .to...Methods //
        this.positionType = positionType; // objects need .toStringMethods and or .to...Methods //
        this.coreCompetency = coreCompetency; // objects need .toStringMethods and or .to...Methods //


    }
    // Don't change this, this allowed for the test to pass 12 out of 14 //
// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields match

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id. // This task should be done //

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
    // Part 5 add toStringMethod //


    @Override
    public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(System.lineSeparator());

            sb.append("ID: ").append(getId() != 0 ? getId() : "Data not available").append(System.lineSeparator());

        // Append Name with "Data not available" handling
           String nameInfo = (name != null && !name.isEmpty()) ? name : "Data not available";
            sb.append("Name: ").append(nameInfo).append(System.lineSeparator());

            String employerInfo = (employer != null && !employer.toString().isBlank()) ? employer.toString() : "Data not available";
            sb.append("Employer: ").append(employerInfo).append(System.lineSeparator());

             // Handle Location field
            String locationInfo = (location != null && !location.toString().isBlank()) ? location.toString() : "Data not available";
            sb.append("Location: ").append(locationInfo).append(System.lineSeparator());

            // Handle Position Type field
            String positionTypeInfo = (positionType != null && !positionType.toString().isBlank()) ? positionType.toString() : "Data not available";
            sb.append("Position Type: ").append(positionTypeInfo).append(System.lineSeparator());

            String coreCompetencyInfo = (coreCompetency != null && !coreCompetency.toString().isBlank()) ? coreCompetency.toString() : "Data not available";
            sb.append("Core Competency: ").append(coreCompetencyInfo).append(System.lineSeparator());

            return sb.toString();
           }
          }
