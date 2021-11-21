package at.htl.controll;

import at.htl.entity.Customer;
import at.htl.entity.Tea;
import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class initBean {

    @Inject
    CustomerRepository repo;
    @Inject
    TeaRepository teaRepo;

    void init(@Observes StartupEvent event){
        RepoInsert();
    }

    void RepoInsert(){

        List<Tea> teas = new ArrayList<Tea>();

        teas.add(new Tea("Kamille", 2.99, false));
        teas.add(new Tea("Granatapfel", 1.99, false));
        teas.add(new Tea("Gruen", 1.49, true));

        for (Tea tea:teas) {
            teaRepo.insertIntoDatabase(tea);
        }
        Customer c1 = new Customer("Lukas", "Baum", LocalDate.parse("22.09.2003", DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        repo.insertIntoDatabase(c1);

        Customer c2 = new Customer("Mandi", "Baumi", LocalDate.parse("22.09.2010", DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        repo.insertIntoDatabase(c2);
    }
}
