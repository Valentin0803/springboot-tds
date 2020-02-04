package s4.spring.td2.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String suspended;

    @ManyToMany
    private Organization organization;

    @ManyToMany(mappedBy="users")
    private List<Groupe> groupes;



    public User(int id, String firstname, String lastname, String email, String password, String suspended, Organization organization, List<Groupe> groupes) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.suspended = suspended;
        this.organization = organization;
        this.groupes = groupes;
    }
}
