// ToDo_Fasade class provides a simplified interface for interacting with the Task_Manager.
// It acts as a facade, allowing users to add tasks, retrieve the list of tasks, and mark tasks as completed without needing to directly interact with the Task_Manager class.
package com.mycompany.app;

import java.util.ArrayList;

public class ToDo_Fasade{
    private TaskOperations taskManager;

    public ToDo_Fasade() {
        taskManager = Task_Manager.getInstance();
    }
    public ToDo_Fasade(TaskOperations taskManager) {
        this.taskManager = taskManager;
    }
    
    public void addTask(String title){
        taskManager.addTask(title);
        System.out.println("Task added: " + title);
    }
    public void getTasks(){
        ArrayList<Task> tasks = taskManager.getTasks();
        System.out.println("Current tasks:");

        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
    public void completeTask(int index){
        if (taskManager.completeTask(index - 1)) {
            System.out.println("Task " + index + " marked as completed.");
        } else {
            System.out.println("Invalid task index: " + index);
        }
    }
}