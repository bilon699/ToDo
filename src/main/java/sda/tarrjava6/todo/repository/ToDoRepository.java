package sda.tarrjava6.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sda.tarrjava6.todo.entity.ToDoEntity;

import java.util.List;

@Repository
public interface ToDoRepository extends CrudRepository<ToDoEntity, Long> {

    List<ToDoEntity> getAllByCompleted(boolean completed);

    ToDoEntity getById(Long id);
}


