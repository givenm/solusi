/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.person;

import java.util.List;
import zw.ac.solusiuniversity.model.Person;

/**
 *
 * @author Luckbliss
 */
public interface PersonCRUDService {
    public Person findById(String id);

    public List<Person> findAll();

    public void persist(Person person);

    public void merge(Person person);

    public void delete(Person person);
}
