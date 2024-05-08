package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;

import java.util.jar.Attributes;

import static org.junit.Assert.*;
import static org.testng.Assert.assertNotEquals;

public class JobTest {
    //TODO: Create your unit tests

    // @Test needs ClassNotFoundException according to the test //

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        // Instantiate two job objects //
        assertNotEquals(job1.getId(), job2.getId());
        // compare if equality of job1 and job2 //
    }
    // Test 1 passes Test 4 Test, wow that's weird to say lol //
    @Test
    public void testJobConstructorSetsAllFields() {

        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        // instantiate the object with the provided field parameters //

        assertEquals("Product tester", job.getName().toString());

        assertEquals("ACME",job.getEmployer().toString());
        assertTrue(job.getEmployer() instanceof Employer );

        assertEquals("Desert", job.getLocation().toString());
        assertTrue(job.getLocation() instanceof Location );

        assertEquals("Quality control", job.getPositionType().toString());
        assertTrue(job.getPositionType() instanceof PositionType );

        assertEquals("Persistence", job.getCoreCompetency().toString());
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency );
    }
    // Passed the second part 4 test do not change yet lol //
    @Test
    public void testJobsForEquality(){
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

       assertFalse("Jobs with different IDs should not be equal",job1.equals(job));
    }
    // Passed all four Junit test for part 4 //
}
