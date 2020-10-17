package sda.tarrjava6.todo.repository;

import org.springframework.data.repository.CrudRepository;
import sda.tarrjava6.todo.entity.ItemEntity;

import java.util.List;

public interface ItemRepository extends CrudRepository<ItemEntity, Long> {


}

