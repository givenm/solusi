/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.accomodationrequired.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.AccomodationRequired;
import zw.ac.solusiuniversity.repository.AccomodationRequiredRepository;
import zw.ac.solusiuniversity.services.crud.accomodationrequired.AccomodationRequiredCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class AccomodationRequiredCRUDServiceImpl implements AccomodationRequiredCRUDService {

    @Autowired
    private AccomodationRequiredRepository repository;

    @Override
    public List<AccomodationRequired> findAll() {
        return repository.findAll();
    }

    @Override
    public void persist(AccomodationRequired accomodationRequired) {
        repository.save(accomodationRequired);
    }

    @Override
    public void merge(AccomodationRequired accomodationRequired) {
        if (accomodationRequired.getId() != null) {
            repository.save(accomodationRequired);
        }
    }

    @Override
    public AccomodationRequired findById(String id) {
        try {
            return repository.findOne(id);
        }
        catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(AccomodationRequired accomodationRequired) {
        repository.delete(accomodationRequired);
    }
}
