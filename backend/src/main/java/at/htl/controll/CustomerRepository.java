package at.htl.controll;

import at.htl.entity.Customer;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class CustomerRepository {

    @Inject
    EntityManager em;

    @Transactional
    public void insertIntoDatabase(Customer cus){
        em.persist(cus);
    }

    public List<Customer> findAllLukas() {
        return em.createNamedQuery("Customer.findAllLukas").getResultList();
    }

    public List<Customer> findAll() {
        return em.createNamedQuery("Customer.findAll").getResultList();
    }
}
