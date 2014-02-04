/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.accomodation.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.Accomodation;
import zw.ac.solusiuniversity.repository.AccomodationRepository;
import zw.ac.solusiuniversity.services.crud.accomodation.AccomodationCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class AccomodationCRUDServiceImpl implements AccomodationCRUDService{
    
    @Autowired
    private AccomodationRepository repository;
    
    @Override
    public List<Accomodation> findAll(){
        return repository.findAll();
    }

    @Override
    public void persist(Accomodation accomodation) {
        repository.save(accomodation);
    }

    @Override
    public void merge(Accomodation accomodation) {
        if (accomodation.getId() != null) {
            repository.save(accomodation);
        }
    }

    @Override
    public Accomodation findById(String id) {
        try {
            return repository.findOne(id);
        } catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(Accomodation accomodation) {
        repository.delete(accomodation);
    }
}
