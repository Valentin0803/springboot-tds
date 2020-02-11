package s4.spring.td2.controleurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import s4.spring.td2.entities.Organization;
import s4.spring.td2.repositories.OrgaRepositorie;

@Controller
@RequestMapping("/orgas/")
public class OrgoControler {

    @Autowired
    private OrgaRepositorie repo;

    @GetMapping("/orgas")
    public String viewListeOrga(){
        return "orgasListe";
    }

    @PostMapping("new")
    @ResponseBody
    public String newOrga(Organization orga) {
        repo.saveAndFlush(orga);
        return orga+" ajoutée.";
    }
}
