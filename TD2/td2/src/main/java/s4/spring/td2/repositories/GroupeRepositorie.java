package s4.spring.td2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import s4.spring.td2.entities.Groupe;
import s4.spring.td2.entities.Organization;

import java.util.List;

public interface GroupeRepositorie extends JpaRepository<Groupe, Integer> {
    List<Organization> findById(int id);

}
