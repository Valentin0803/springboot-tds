package s4.spring.TD1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public @ResponseBody String hello(){
        return "Hello World";
    }

    @GetMapping("/view/hello")
    public String viewHello(ModelMap model){
        model.put("message","Bonjour tout le monde !");
        return "hello";
    }

    @GetMapping("hello/{message}")
    public String viewHelloDyn(@PathVariable String message){
        return "hello";
    }

}
