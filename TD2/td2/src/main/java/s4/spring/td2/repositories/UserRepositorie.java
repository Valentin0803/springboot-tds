package s4.spring.td2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import s4.spring.td2.entities.Groupe;
import s4.spring.td2.entities.Organization;
import s4.spring.td2.entities.User;

import java.util.List;

public interface UserRepositorie extends JpaRepository<User, Integer> {
    List<Organization> findById(String domain);
    List<Organization> findByFirstname(String firstname);
    List<Organization> findByLastname(String lastname);
}
