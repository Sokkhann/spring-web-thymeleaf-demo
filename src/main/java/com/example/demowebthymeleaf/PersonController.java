package com.example.demowebthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @GetMapping
    String getPeople(Model model) {
        Person person = new Person(1, "sk", "sk123@gmail.com");
        model.addAttribute("person", person);
        return "people";
    }
}
