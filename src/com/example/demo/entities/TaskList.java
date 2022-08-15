package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskList {

    private String name;
    private List<Task> tasks;

    public TaskList(String name){
        this.setName(name);
        this.tasks = new ArrayList<Task>();
    }

    public String getName(){
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public void addTask(Task task){
        this.tasks.add(task);
    }

    public void removeTask(String description){
        this.tasks = tasks.stream().filter(t->{
            return !t.getDescription().equals(description);
        }).collect(Collectors.toList());
    }

    public void printTasks(){
        this.tasks.forEach(task -> {
            System.out.println("descripción: ");
            System.out.println(task.getDescription());
            System.out.println("fecha: ");
            System.out.println(task.getDueDate());
            System.out.println("realizada: ");
            System.out.println(task.getDone());
            System.out.println("-------------------------");
        });
    }
}
