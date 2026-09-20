package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Before;
public class Task_ManagerTest{
    private TaskOperations manager;
    
    @Before
    public void setUp(){
        // Clear the task list before each test to ensure a clean state
        manager = Task_Manager.getInstance();
        manager.getTasks().clear();
    }

    // Test to verify that the singleton instance of Task_Manager is the same across multiple calls
    @Test
    public void testAddTaskTitle() {
        manager.addTask("Study Design Patterns");
        assertEquals("Study Design Patterns", manager.getTasks().get(0).getTaskTitle());
    }

    // Test to verify that a task can be marked as completed and the status is updated correctly
    @Test
    public void testSingletonInstance(){
        TaskOperations instance1 = Task_Manager.getInstance();
        assertSame(manager, instance1);
    }
    
    // Test to verify that a task can be marked as completed and the status is updated correctly
    @Test
    public void testAddTask(){
        manager.addTask("Project Delivery");
        assertEquals("Project Delivery", manager.getTasks().get(0).getTaskTitle());
        
        }
        
    // Test to verify that a task can be marked as completed and the status is updated correctly
    @Test
    public void testCompleteTaskSuccess() {
        manager.addTask("Complete the project");
        boolean result = manager.completeTask(0);
        assertTrue(result);
    }

    // Test to verify that attempting to complete a task with an invalid index returns false
    @Test
    public void testCompleteTaskInvalidIndex() {
        boolean result = manager.completeTask(99);
        assertFalse(result);
    }

    // Test to verify that the task list is not null when retrieved
    @Test
    public void testGetTasksNotNull() {
        assertNotNull(manager.getTasks());
    }

    // Test to verify that the task list is initially empty when retrieved
    @Test
    public void testTaskCount() {
        manager.addTask("Task 1");
        manager.addTask("Task 2");
        assertEquals(2, manager.getTasks().size());
    }
}