package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testHomeworkUpdate() {
        //Given
        StudentQueue student1 = new StudentQueue("Jan Nowak");
        StudentQueue student2 = new StudentQueue("Anna Kowalska");
        StudentQueue student3 = new StudentQueue("Paweł Kowalski");
        Teacher teacher1 = new Teacher("Piotr Nowacki");
        Teacher teacher2 = new Teacher("Kamila Cicha");
        student1.registerObserver(teacher1);
        student2.registerObserver(teacher1);
        student3.registerObserver(teacher2);

        //When
        student1.addExercise("Objects");
        student2.addExercise("Patterns2");
        student3.addExercise("REST API");
        student1.addExercise("MySQL");
        student1.addExercise("My Tasks");
        student3.addExercise("Create new model");

        //Then
        assertEquals(4, teacher1.getUpdateCount());
        assertEquals(2, teacher2.getUpdateCount());
    }
}
