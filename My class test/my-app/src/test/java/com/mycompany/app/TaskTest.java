package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TaskTest{
    @Test
    public void testTaskCreation() {
        // Test the creation of a Task object and its initial state
        Task task = new Task("Test Task");
        assertEquals("Test Task", task.getTaskTitle());
        task.setTaskTitle("Updated Task");
        assertEquals("Updated Task", task.getTaskTitle());

       
    }

    @Test
    public void testTaskCompletion() {
        Task task = new Task("Test Task");
        task.setIsCompleted(true);
        assertTrue(task.getIsCompleted());
    }
}