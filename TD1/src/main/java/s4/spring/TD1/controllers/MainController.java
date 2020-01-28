package s4.spring.TD1.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import s4.spring.TD1.models.Element;

import java.util.ArrayList;
import java.util.List;

@SessionAttributes("items")
public class MainController {

    @ModelAttribute("items")
    public List<Element> getItems(){
        return new ArrayList<>();
    }

}
