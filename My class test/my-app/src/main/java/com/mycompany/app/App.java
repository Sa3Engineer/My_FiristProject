package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        ToDo_Fasade todoApp = new ToDo_Fasade();

        // adding tasks to the list
        todoApp.addTask("Learn Singleton pattern");
        todoApp.addTask("Learn Facade pattern");

        // displaying the list
        todoApp.getTasks();

        // marking the first task as completed
        todoApp.completeTask(1);

        // displaying the list after updating
        todoApp.getTasks();
    }
}