package app.test.dao;

import app.test.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    // Find all persons by name fragment
    @Query(value = "SELECT * FROM Person WHERE LOWER(name) LIKE %?1%", nativeQuery = true)
    List<Person> findByNameContaining(String personName);

}
