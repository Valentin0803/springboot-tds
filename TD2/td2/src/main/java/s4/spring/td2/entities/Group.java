package s4.spring.td2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Group {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String name;
    private String email;
    private String aliases;
}
