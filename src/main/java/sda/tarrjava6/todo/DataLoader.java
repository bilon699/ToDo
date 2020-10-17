package sda.tarrjava6.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import sda.tarrjava6.todo.entity.ItemEntity;
import sda.tarrjava6.todo.repository.ItemRepository;

import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    private ItemRepository itemRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        for ( int i =0; i < 10; i++ ) {

            ItemEntity entity = new ItemEntity();
            entity.setName("item nr " + (i + 1));
            entity.setDate(new Date());

            itemRepository.save(entity);
        }


    }
}
