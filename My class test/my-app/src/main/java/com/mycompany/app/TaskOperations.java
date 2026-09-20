package com.mycompany.app;

import java.util.ArrayList;

public interface TaskOperations {
    void addTask(String title);
    boolean completeTask(int index);
    ArrayList<Task> getTasks();
}