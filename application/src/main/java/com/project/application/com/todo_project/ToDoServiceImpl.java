package com.project.application.com.todo_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class ToDoServiceImpl extends ToDoService {

    @Autowired
    private ToDoRepository repository;

    @Override
    public ToDo create(ToDo todo) {
        return repository.save(todo);
    }


    @Override
    public List<ToDo> findAll() {
        return repository.findAll();
    }

    @Override
    public ToDo findById(int id) {
        return repository.findOne(id);
    }


}
