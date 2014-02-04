/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.person.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.Person;
import zw.ac.solusiuniversity.repository.PersonRepository;
import zw.ac.solusiuniversity.services.crud.person.PersonCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class PersonCRUDServiceImpl implements PersonCRUDService {

    @Autowired
    private PersonRepository repository;

    @Override
    public List<Person> findAll() {
        return repository.findAll();
    }

    @Override
    public void persist(Person person) {
        repository.save(person);
    }

    @Override
    public void merge(Person person) {
        if (person.getId() != null) {
            repository.save(person);
        }
    }

    @Override
    public Person findById(String id) {
        try {
            return repository.findOne(id);
        }
        catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(Person person) {
        repository.delete(person);
    }
}