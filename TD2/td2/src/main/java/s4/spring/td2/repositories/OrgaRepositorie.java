package s4.spring.td2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import s4.spring.td2.entities.Organization;

import java.util.List;

public interface OrgaRepositorie extends JpaRepository<Organization, Integer> {
    List<Organization> findById(int id);
    List<Organization> findByName(String name);

    @Override
    List<Organization> findAll();
}
