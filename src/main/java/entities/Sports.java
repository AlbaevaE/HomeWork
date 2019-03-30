package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sports")
public class Sports {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "means")
    private String means;

    public Sports() {
    }

    public Sports(Integer id, String means) {
        this.id = id;
        this.means = means;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMeans() {
        return means;
    }

    public void setMeans(String means) {
        this.means = means;
    }

    @Override
    public String toString() {
        return "Sports: " +
                "id: " + id +
                ", means: " + means;
    }
}
