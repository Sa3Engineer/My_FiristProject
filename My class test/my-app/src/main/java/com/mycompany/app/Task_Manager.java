// Task_Manager class is a singleton that manages a list of tasks.
// It is responsible for managing and storing the entire task list.It provides methods to add, remove, and retrieve tasks from the list.
package com.mycompany.app;

import java.util.ArrayList;

public class Task_Manager implements TaskOperations {
    private static Task_Manager task;
    private ArrayList<Task> taskList = new ArrayList<>();
    private Task_Manager() {}

    public static Task_Manager getInstance() {
        if (task == null) {
            task = new Task_Manager();
        }
        return task;
    }
    @Override
    public void addTask(String title) {
        taskList.add(new Task(title));
    }
    @Override
    public ArrayList<Task> getTasks() {
        return taskList;
    }
    @Override
    public boolean completeTask(int index) {
        if (index >= 0 && index < taskList.size()) {
            taskList.get(index).setIsCompleted(true);
            return true;
        }
        return false;
    }
}