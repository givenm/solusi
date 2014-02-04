/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.contact;

import java.util.List;
import zw.ac.solusiuniversity.model.Contact;

/**
 *
 * @author Luckbliss
 */
public interface ContactCRUDService {
    public Contact findById(String id);

    public List<Contact> findAll();

    public void persist(Contact contact);

    public void merge(Contact contact);

    public void delete(Contact contact);
}
