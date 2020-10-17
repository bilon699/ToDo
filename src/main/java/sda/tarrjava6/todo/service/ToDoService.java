package sda.tarrjava6.todo.service;

import sda.tarrjava6.todo.entity.ToDoEntity;

import java.util.List;

public interface ToDoService {

    List<ToDoEntity> getAll();

    List<ToDoEntity> getAllCompleted();

    ToDoEntity addTodo(String name);

    void completeTodo(Long id);
}
