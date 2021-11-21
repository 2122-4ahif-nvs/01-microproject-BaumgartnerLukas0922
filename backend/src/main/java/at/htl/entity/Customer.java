package at.htl.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(
                name = "Customer.findAllLukas",
                query = "Select c from Customer c where c.firstName = 'Lukas'"
        ),
        @NamedQuery(
                name = "Customer.findAll",
                query = "Select c from Customer c"
        ),
        @NamedQuery(
                name = "Customer.getCustomerById",
                query = "Select c from Customer c where c.id = :ID"
        )
})
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private LocalDate dob; //Date Of Birth

    //region constructor
    public Customer() {

    }

    public Customer(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }
    //endregion

    //region setterAndGetter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    //endregion
}
