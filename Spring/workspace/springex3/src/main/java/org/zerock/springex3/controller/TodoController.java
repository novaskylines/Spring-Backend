package org.zerock.springex3.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.springex3.controller.dto.TodoDTO;

@Controller
@Log4j2
@RequestMapping("/todo")
public class TodoController {
    // 주소 : http://localhost:8081/todo/list
    @GetMapping("/list")
    public String list(){
        log.info("list");
        return "list";
    }
    // 주소 : http://localhost:8081/todo/register
    @GetMapping("/register")
    public String register(){
        log.info("register");
        return "register";
    }
    @PostMapping("/register")
    public String registerPost(TodoDTO todoDTO){
        log.info("register post");
        log.info(todoDTO);
        return "redirect:/hello";
    }
    // GetMapping과 같은 방식
    @RequestMapping(value="/edit", method= RequestMethod.GET)
    public String edit(){
        log.info("edit");
        return "edit";
    }
    // PostMapping과 같은 방식
    @RequestMapping(value="/edit", method= RequestMethod.POST)
    public String editPost(){
        log.info("editPost");
        return "redirect:/hello";
    }
}
