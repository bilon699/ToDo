package sda.tarrjava6.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import sda.tarrjava6.todo.entity.ToDoEntity;
import sda.tarrjava6.todo.repository.ToDoRepository;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private ToDoRepository toDoRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        for (int i = 1; i <= 15; i++) {
            insertTodo(i, false);
            insertTodo(i, true);
        }
    }

    private void insertTodo(int index, boolean completed) {
        ToDoEntity todo = new ToDoEntity();
        todo.setName("Zadanie " + index);
        todo.setCompleted(completed);

        toDoRepository.save(todo);
    }
}
