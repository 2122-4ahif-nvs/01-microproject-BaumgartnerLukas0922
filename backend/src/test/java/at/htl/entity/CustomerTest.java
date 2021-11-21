package at.htl.entity;

import at.htl.controll.CustomerRepository;
import at.htl.controll.TeaRepository;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class CustomerTest {

    @Inject
    CustomerRepository repo;

    @Test
    void firstInsert(){
        Customer c1 = new Customer("Heinz", "Anderer", LocalDate.parse("22.09.2003", DateTimeFormatter.ofPattern("dd.MM.yyyy")));

        repo.insertIntoDatabase(c1);
    }
}