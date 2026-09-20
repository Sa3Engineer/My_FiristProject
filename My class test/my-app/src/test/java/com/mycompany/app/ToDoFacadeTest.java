package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ToDoFacadeTest {

    private ToDo_Fasade facade;

    @Before
    public void setUp() {
        facade = new ToDo_Fasade();
        Task_Manager.getInstance().getTasks().clear();
    }

    @Test
    public void testFacadeOperations() {
        facade.addTask("Facade Task");
        assertEquals(1, Task_Manager.getInstance().getTasks().size());

        facade.getTasks();
        facade.completeTask(1);
    }
}