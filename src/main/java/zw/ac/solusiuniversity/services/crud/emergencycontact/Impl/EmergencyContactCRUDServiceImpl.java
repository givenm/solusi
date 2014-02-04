/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.emergencycontact.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.EmergencyContact;
import zw.ac.solusiuniversity.repository.EmergencyContactRepository;
import zw.ac.solusiuniversity.services.crud.emergencycontact.EmergencyContactCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class EmergencyContactCRUDServiceImpl implements EmergencyContactCRUDService{
    
    @Autowired
    private EmergencyContactRepository repository;
    
    @Override
    public List<EmergencyContact> findAll(){
        return repository.findAll();
    }

    @Override
    public void persist(EmergencyContact emergencyContact) {
        repository.save(emergencyContact);
    }

    @Override
    public void merge(EmergencyContact emergencyContact) {
        if (emergencyContact.getId() != null) {
            repository.save(emergencyContact);
        }
    }

    @Override
    public EmergencyContact findById(String id) {
        try {
            return repository.findOne(id);
        } catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(EmergencyContact emergencyContact) {
        repository.delete(emergencyContact);
    }
}