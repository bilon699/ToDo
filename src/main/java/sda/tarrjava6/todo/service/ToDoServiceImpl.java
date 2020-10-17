package sda.tarrjava6.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sda.tarrjava6.todo.entity.ToDoEntity;
import sda.tarrjava6.todo.repository.ToDoRepository;

import java.util.List;

@Service("todoService")
public class ToDoServiceImpl implements ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

//    @Autowired
//    public TodoServiceImpl(TodoRepository todoRepository) {
//        this.todoRepository = todoRepository;
//    }

    @Override
    public List<ToDoEntity> getAll() {
        return toDoRepository.getAllByCompleted(false);
    }

    @Override
    public List<ToDoEntity> getAllCompleted() {
        return toDoRepository.getAllByCompleted(true);
    }

    @Override
    public ToDoEntity addTodo(String name) {
        ToDoEntity todo = new ToDoEntity(name, false);
        return toDoRepository.save(todo);
    }

    @Override
    public void completeTodo(Long id) {
        ToDoEntity todo = toDoRepository.getById(id);

        if (todo != null) {
            todo.setCompleted(true);
            toDoRepository.save(todo);
        }
    }
}
