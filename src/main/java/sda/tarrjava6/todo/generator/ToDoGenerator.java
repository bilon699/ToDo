package sda.tarrjava6.todo.generator;

import sda.tarrjava6.todo.dto.ToDoDto;

import java.util.ArrayList;
import java.util.List;

public class ToDoGenerator {

    public static List<ToDoDto> generateTodoDtoList(int count) {

        List<ToDoDto> todos = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
            ToDoDto dto = new ToDoDto("Zadanie " + i);
            todos.add(dto);
        }

        return todos;
    }
}



