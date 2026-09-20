// Task class represents a task with a title and completion status.
// Task class represents a single task format and gathers its data (title and completion status) in one place.
package com.mycompany.app;

public class Task{
    private String taskTitle;
    private boolean isCompleted;

    public Task (String taskTitle){
        this.taskTitle = taskTitle;
        this.isCompleted = false;
    }

    public String getTaskTitle(){
        return taskTitle;
    }
    public boolean getIsCompleted(){
        return isCompleted;
    }
    public void setIsCompleted(boolean isCompleted){
        this.isCompleted = isCompleted;
    }
    public void setTaskTitle(String taskTitle){
        this.taskTitle = taskTitle;
    }
    @Override
    public String toString() {
        return (isCompleted ? "[✓] " : "[ ] ") + taskTitle;
    }    
}