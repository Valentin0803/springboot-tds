package s4.spring.td2.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Groupe {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String name;
    private String email;
    private String aliases;

    @ManyToMany
    private List<Organization> organization;

    @ManyToMany
    @JoinTable(name = "user_group")
    private List<User> users;
}
