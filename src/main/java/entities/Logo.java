package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "logo")
public class Logo {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "logo_address")
    private String logoAddress;


    public Logo() {
    }

    public Logo(Integer id, String logoAddress) {
        this.id = id;
        this.logoAddress = logoAddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogoAddress() {
        return logoAddress;
    }

    public void setLogoAddress(String logoAddress) {
        this.logoAddress = logoAddress;
    }

    @Override
    public String toString() {
        return "Logo: " +
                "id: " + id +
                ", logoAddress: " + logoAddress;
    }
}
