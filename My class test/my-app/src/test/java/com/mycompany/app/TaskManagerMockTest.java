package com.mycompany.app;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import org.junit.Test;

public class TaskManagerMockTest {

    @Test
    public void testAddTaskWithMock() {
        // Create a mock of Task_Manager
        Task_Manager mockTaskManager = mock(Task_Manager.class);

        // Create an instance of ToDo_Fasade with the mocked Task_Manager
        ToDo_Fasade todoApp = new ToDo_Fasade(mockTaskManager);

        // Call the addTask method
        todoApp.addTask("Mocked Task");

        // Verify that the addTask method was called once with the correct argument
        verify(mockTaskManager, times(1)).addTask("Mocked Task");
    }
}