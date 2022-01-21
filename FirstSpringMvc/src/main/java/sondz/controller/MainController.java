package sondz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    @RequestMapping("/index/{id}")
    public String indexControl(@PathVariable("id")int id, Model model){
        System.out.println("index method");
        model.addAttribute("id",id);
        return "index";
    }
    @RequestMapping("/hello")
    public String helloControl(){
        return "dataPost";
    }
    @RequestMapping("/testParam")
    public String testParam(@RequestParam(name="name") String name,Model model){
        System.out.println(name);
        model.addAttribute("name",name);
        return "hello";
    }
    @PostMapping(value = "getPost")
    public String getPost(@RequestParam(name = "name") String name,
                          @RequestParam(name="pass") String pass){
        System.out.println(name);
        System.out.println(pass);
        return "dataPost";
    }
}
