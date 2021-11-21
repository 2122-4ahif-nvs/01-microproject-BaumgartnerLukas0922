package at.htl.controll;

import at.htl.entity.Customer;
import at.htl.entity.Tea;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
public class TeaRepository {

    @Inject
    EntityManager em;

    @Transactional
    public void insertIntoDatabase(Tea tea){
        em.persist(tea);
    }
}
