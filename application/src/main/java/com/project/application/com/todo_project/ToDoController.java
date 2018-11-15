package com.project.application.com.todo_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
//@RequestMapping({"/api"})
@RequestMapping({"/alltodo"})

public class ToDoController {

    @Autowired
    private ToDoService todoService;

    @PostMapping
    public ToDo create(@RequestBody ToDo todo){
        return todoService.create(todo);
    }

    @GetMapping(path = {"/{id}"})
    public ToDo findOne(@PathVariable("id") int id){
        return todoService.findById(id);
    }

    @GetMapping
    public List<ToDo> findAll(){
        return todoService.findAll();
    }
}

