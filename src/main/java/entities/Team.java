package entities;

import javax.persistence.*;

@Entity
@Table(name = "team")

public class Team {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @OneToOne
    @JoinColumn(name = "logo_id")
    private Logo logoId;
    @Column(name = "official_website")
    private String officialWebsite;

    @OneToOne
    @JoinColumn(name = "sports_id")
    private Sports sportsId;

    public Team(Integer id, String name, Logo logoId, String officialWebsite, Sports sportsId) {
        this.id = id;
        this.name = name;
        this.logoId = logoId;
        this.officialWebsite = officialWebsite;
        this.sportsId = sportsId;
    }

    public Team() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Logo getLogoId() {
        return logoId;
    }

    public void setLogoId(Logo logoId) {
        this.logoId = logoId;
    }

    public String getOfficialWebsite() {
        return officialWebsite;
    }

    public void setOfficialWebsite(String officialWebsite) {
        this.officialWebsite = officialWebsite;
    }

    public Sports getSportsId() {
        return sportsId;
    }

    public void setSportsId(Sports sportsId) {
        this.sportsId = sportsId;
    }

    @Override
    public String toString() {
        return "Team: " +
                "id: " + id +
                ", name: " + name + '\'' +
                ", logoId: " + logoId +
                ", officialWebsite: " + officialWebsite + '\'' +
                ", sportsId: " + sportsId;
    }
}
