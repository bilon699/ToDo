package sda.tarrjava6.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sda.tarrjava6.todo.dto.ToDoDto;
import sda.tarrjava6.todo.entity.ToDoEntity;
import sda.tarrjava6.todo.mapper.ToDoMapper;
import sda.tarrjava6.todo.service.ToDoService;


import java.util.List;

@Controller
public class ToDoController {

    @Autowired
    private ToDoService todoService;

    @RequestMapping(value = "/todos", method = RequestMethod.GET)
    public String todos(Model model) {

        List<ToDoEntity> todos = todoService.getAll();
        List<ToDoEntity> completed = todoService.getAllCompleted();

        List<ToDoDto> dtos = ToDoMapper.mapEntityToDto(todos);
        List<ToDoDto> completedDtos = ToDoMapper.mapEntityToDto(completed);

        model.addAttribute("todos", dtos);
        model.addAttribute("completed", completedDtos);

        return "todos";
    }

    @ResponseBody
    @RequestMapping(value = "/todos/{name}", method = RequestMethod.POST)
    public ResponseEntity<?> addTodos(@PathVariable("name") String name) {

        ToDoEntity todo = todoService.addTodo(name);

        ToDoDto dto = ToDoMapper.mapEntityToDto(todo);

        return ResponseEntity.ok(dto);
    }

    @ResponseBody
    @RequestMapping(value = "/todos/{id}", method = RequestMethod.PUT, produces = MediaType.TEXT_PLAIN_VALUE)
    public String updateComplated(@PathVariable("id") Long id) {

        todoService.completeTodo(id);

        return "200 OK";
    }

}


