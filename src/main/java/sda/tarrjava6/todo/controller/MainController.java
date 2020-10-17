package sda.tarrjava6.todo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/index")
    public String index(Model model) {


        // jakaś zmiana

        return "index";
    }
}
