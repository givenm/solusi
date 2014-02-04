/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.bachelorexisting.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.BachelorExisting;
import zw.ac.solusiuniversity.repository.BachelorExistingRepository;
import zw.ac.solusiuniversity.services.crud.bachelorexisting.BachelorExistingCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class BachelorExistingCRUDServiceImpl implements BachelorExistingCRUDService{
    
    @Autowired
    private BachelorExistingRepository repository;
    
    @Override
    public List<BachelorExisting> findAll(){
        return repository.findAll();
    }

    @Override
    public void persist(BachelorExisting bachelorExisting) {
        repository.save(bachelorExisting);
    }

    @Override
    public void merge(BachelorExisting bachelorExisting) {
        if (bachelorExisting.getId() != null) {
            repository.save(bachelorExisting);
        }
    }

    @Override
    public BachelorExisting findById(String id) {
        try {
            return repository.findOne(id);
        } catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(BachelorExisting bachelorExisting) {
        repository.delete(bachelorExisting);
    }
}