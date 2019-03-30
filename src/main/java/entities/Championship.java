package entities;

import javax.persistence.*;

@Entity
@Table(name = "championship")

public class Championship {
    @Id
    @Column(name = "id")
    private Integer id;
    @OneToOne
    @JoinColumn(name = "contry_id")
    private Contry contryId;
    @Column(name = "championship_name")
    private String championshipName;
    @OneToOne
    @JoinColumn(name = "sports_id")
    private Sports sportsId;

    public Championship() {
    }

    public Championship(Integer id, Contry contryId, String championshipName, Sports sportsId) {
        this.id = id;
        this.contryId = contryId;
        this.championshipName = championshipName;
        this.sportsId = sportsId;
    }

    @Override
    public String toString() {
        return "Championship{" +
                "id: " + id +
                ", contryId: " + contryId +
                ", championshipName: " + championshipName + '\'' +
                ", sportsId: " + sportsId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Contry getContryId() {
        return contryId;
    }

    public void setContryId(Contry contryId) {
        this.contryId = contryId;
    }

    public String getChampionshipName() {
        return championshipName;
    }

    public void setChampionshipName(String championshipName) {
        this.championshipName = championshipName;
    }

    public Sports getSportsId() {
        return sportsId;
    }

    public void setSportsId(Sports sportsId) {
        this.sportsId = sportsId;
    }
}
