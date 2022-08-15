package com.example.demo.entities;

import java.time.LocalDate;

public class Task {
    private String description;
    private boolean done;
    private LocalDate dueDate;

    public Task (String description, LocalDate dueDate){
        this.description = description;
        this.dueDate = dueDate;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public boolean getDone(){
        return done;
    }

    public void setDone(boolean done){
        this.done = done;
    }

    public LocalDate getDueDate(){
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate){
        this.dueDate = dueDate;
    }
}
