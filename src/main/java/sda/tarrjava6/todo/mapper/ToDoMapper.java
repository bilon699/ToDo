package sda.tarrjava6.todo.mapper;


import sda.tarrjava6.todo.dto.ToDoDto;
import sda.tarrjava6.todo.entity.ToDoEntity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ToDoMapper {

    public static ToDoEntity mapDtoToEntity(ToDoDto dto) {

        return null;
    }

    public static ToDoDto mapEntityToDto(ToDoEntity entity) {

        ToDoDto dto = new ToDoDto(entity.getName());
        dto.setId(entity.getId());

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        dto.setCreateDate(dateFormat.format(entity.getCreateDate()));
        dto.setCloseDate(entity.getCloseDate());
        return dto;
    }

    public static List<ToDoDto> mapEntityToDto(List<ToDoEntity> entities) {

        List<ToDoDto> dtos = new ArrayList<>();

        for (ToDoEntity todo : entities) {
            dtos.add(mapEntityToDto(todo));
        }

        return dtos;
    }
}



