package test;

import classes.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestStudent {

    @Test
    void testIntegralist(){
        Student student = new Student("Gigel",20,5.5);
        assertEquals(student.hasPassedTheYear(), false );

    }


}
