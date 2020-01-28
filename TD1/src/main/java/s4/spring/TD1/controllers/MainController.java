package s4.spring.TD1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import s4.spring.TD1.models.Element;

import java.util.ArrayList;
import java.util.List;

@SessionAttributes("items")
@Controller
public class MainController {

    @ModelAttribute("items")
    public List<Element> getItems(){
        return new ArrayList<>();
    }

    @GetMapping("/items")
    public String viewListeItems(){
        return "listeItems";
    }

    @GetMapping("/items/addNew")
    public String viewAddItems(){
        return "addNew";
    }

    @PostMapping("items/addNew")
    public RedirectView addNew(@RequestParam String nom, @SessionAttribute List<Element> items){
        items.add(new Element(nom));
        return new RedirectView("/items");
    }
}
