package at.htl.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(
                name = "Tea.getTeaById",
                query = "Select t from Tea t where t.id = :ID"
        )
})
public class Tea {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private boolean containsCaffeine;

    //region contructor
    public Tea() {
    }

    public Tea(String name, double price, boolean containsCaffeine) {
        this.name = name;
        this.price = price;
        this.containsCaffeine = containsCaffeine;
    }
    //endregion

    //region setterAndGetter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public boolean isContainsCaffeine() { return containsCaffeine; }

    public void setContainsCaffeine(boolean containsCaffeine) { this.containsCaffeine = containsCaffeine; }
    //endregion
}
