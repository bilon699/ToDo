package sda.tarrjava6.todo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sda.tarrjava6.todo.dto.ItemDto;
import sda.tarrjava6.todo.entity.ItemEntity;
import sda.tarrjava6.todo.repository.ItemRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(Model model) {

        Iterable<ItemEntity> entities = itemRepository.findAll();

        List<ItemDto> items = new ArrayList<>();

        items.add(new ItemDto("pierwszy", "2020-10-17"));
        items.add(new ItemDto("drugi", "2020-10-16"));
        items.add(new ItemDto("trzeci", "2020-10-15"));

        model.addAttribute("items", entities);

        return "main";
    }

}
