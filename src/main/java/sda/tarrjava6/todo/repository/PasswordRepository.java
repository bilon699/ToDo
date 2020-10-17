package sda.tarrjava6.todo.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sda.tarrjava6.todo.entity.PasswordEntity;

@Repository
public interface PasswordRepository extends CrudRepository<PasswordEntity, Long> {

}
