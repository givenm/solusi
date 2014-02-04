/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.contact.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.Contact;
import zw.ac.solusiuniversity.repository.ContactRepository;
import zw.ac.solusiuniversity.services.crud.contact.ContactCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class ContactCRUDServiceImpl implements ContactCRUDService{
    
    @Autowired
    private ContactRepository repository;
    
    @Override
    public List<Contact> findAll(){
        return repository.findAll();
    }

    @Override
    public void persist(Contact contact) {
        repository.save(contact);
    }

    @Override
    public void merge(Contact contact) {
        if (contact.getId() != null) {
            repository.save(contact);
        }
    }

    @Override
    public Contact findById(String id) {
        try {
            return repository.findOne(id);
        } catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(Contact contact) {
        repository.delete(contact);
    }
}