package app.test.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import app.test.dao.PersonRepository;
import app.test.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonRepository repository;

    // Add new person to table
    @PostMapping("/person")
    public String savePerson(@RequestBody Person person) {
        repository.save(person);
        return "Person added";
    }

    // Retrieve person data from db by name fragment
    @GetMapping(path = "/person")
    public String getPerson(@RequestParam String search) throws JsonProcessingException {
        List<Person> persons = new ArrayList<>();

        // Find each row of data which includes searched text and add it to persons list
        repository.findByNameContaining(search.toLowerCase()).forEach(persons::add);

        // Convert persons list into JSON list
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(persons);
    }
}
