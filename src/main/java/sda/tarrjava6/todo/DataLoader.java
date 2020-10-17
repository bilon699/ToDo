package sda.tarrjava6.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import sda.tarrjava6.todo.entity.LoginEntity;
import sda.tarrjava6.todo.entity.ToDoEntity;
import sda.tarrjava6.todo.repository.LoginRepository;
import sda.tarrjava6.todo.repository.PasswordRepository;
import sda.tarrjava6.todo.repository.ToDoRepository;

import javax.xml.crypto.Data;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private ToDoRepository toDoRepository;

    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private PasswordRepository passwordRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        ToDoEntity entity = new ToDoEntity();
        entity.setName("Pierwsze zadanie");
        //entity.setCompleted();
        entity.getCreateDate();

        entity = toDoRepository.save(entity);


        for (int i = 1; i <= 15; i++) {

            ToDoEntity toDoEntity = new ToDoEntity();
            toDoEntity.setName("Pierwsze zadanie do zrobienia" + i);
            toDoEntity.isCompleted();

            toDoEntity = toDoRepository.save(toDoEntity);

            }


        }
//            insertTodo(i, false);
//            insertTodo(i, true);
//        }
//    }
//
//    private void insertTodo(int index, boolean completed) {
//        ToDoEntity todo = new ToDoEntity();
//        todo.setName("Zadanie " + index);
//        todo.setCompleted(completed);
//
//        toDoRepository.save(todo);
    }

