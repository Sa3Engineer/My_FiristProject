package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TaskManagerTest {

    private TaskOperations manager;

    @Before
    public void setUp() {
        manager = Task_Manager.getInstance();
        manager.getTasks().clear(); // Clear tasks before each test to ensure a clean state
    }

    // 1. assertEquals: Checking the title of the added task
    @Test
    public void testAddTaskTitle() {
        manager.addTask("Task 1");
        assertEquals("Task 1", manager.getTasks().get(0).getTaskTitle());
    }

    // 2. assertTrue: Checking the successful completion of an existing task
    @Test
    public void testCompleteTaskSuccess() {
        manager.addTask("Task 2");
        boolean isCompleted = manager.completeTask(0);
        assertTrue(isCompleted);
    }

    // 3-assertFalse: Checking the failure to complete a task with a non-existent index
    @Test
    public void testCompleteTaskFailure() {
        boolean isCompleted = manager.completeTask(99);// Non-existent index
        assertFalse(isCompleted);
    }

    // 4-assertSame: Checking that the object behaves as a Singleton
    @Test
    public void testSingletonInstance() {
        TaskOperations anotherInstance = Task_Manager.getInstance();
        assertSame(manager, anotherInstance);
    }

    // 5-assertNotNull: Checking that the tasks list is not null
    @Test
    public void testGetTasksNotNull() {
        assertNotNull(manager.getTasks());
    }

    // 6-assertNotEquals: Checking that the list size changes after adding an element
    @Test
    public void testListSizeChanges() {
        int initialSize = manager.getTasks().size(); // 0
        manager.addTask("Task 3");
        assertNotEquals(initialSize, manager.getTasks().size());
    }

}