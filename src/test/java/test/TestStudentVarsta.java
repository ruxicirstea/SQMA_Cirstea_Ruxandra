package test;

import classes.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStudentVarsta {
    @Test
    void testVarsta(){
        Student student = new Student("Ioana",17,6);
        assertEquals(student.hasLegalAge(), false );

    }

}
