package sda.tarrjava6.todo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String main(Model model) {

        List<String> items = new ArrayList<>();

        items.add("pierwszy");
        items.add("drugi");
        items.add("trzeci");

        model.addAttribute("items", items);

        return "main";
    }

}
