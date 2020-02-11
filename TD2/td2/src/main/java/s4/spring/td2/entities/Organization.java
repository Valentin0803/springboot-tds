package s4.spring.td2.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Organization {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String name;
    private String domain;
    private String aliases;
    private String organizationSettings;

    @OneToMany(cascade= CascadeType.ALL,mappedBy="organization")
    private List<Groupe> groupes;

    public Organization(String name, String domain, String aliases, String organizationSettings){
        this.name = name;
        this.domain = domain;
        this.aliases = aliases;
        this.organizationSettings = organizationSettings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getAliases() {
        return aliases;
    }

    public void setAliases(String aliases) {
        this.aliases = aliases;
    }

    public String getOrganizationSettings() {
        return organizationSettings;
    }

    public void setOrganizationSettings(String organizationSettings) {
        this.organizationSettings = organizationSettings;
    }

    public List<Groupe> getGroupes() {
        return groupes;
    }

    public void setGroupes(List<Groupe> groupes) {
        this.groupes = groupes;
    }

}
