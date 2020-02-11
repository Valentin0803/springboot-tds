package s4.spring.td2.controleurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import s4.spring.td2.entities.Organization;
import s4.spring.td2.repositories.OrgaRepositorie;

import java.util.ArrayList;
import java.util.List;

@Controller
public class OrgoControler {

    @Autowired
    private OrgaRepositorie repo;

    @GetMapping("/orgas")
    public String viewListeOrga(ModelMap model){
        ArrayList<Organization> listeOrga = new ArrayList<Organization>();
        listeOrga.add(new Organization("Just For a Shot", "Audiovisuel", "JFS", "blblbla"));
        model.put("liste", listeOrga);
        return "orgasListe";
    }

    @PostMapping("new")
    @ResponseBody
    public String newOrga(Organization orga) {
        repo.saveAndFlush(orga);
        return orga+" ajoutée.";
    }
}
