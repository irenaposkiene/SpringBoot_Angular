package com.project.application.com.todo_project;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface ToDoRepository extends Repository<ToDo, Integer> {

    List<ToDo> findAll();

    ToDo findOne(int id);

    ToDo save(ToDo todo);
}