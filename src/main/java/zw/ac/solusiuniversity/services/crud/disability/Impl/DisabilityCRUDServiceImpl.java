/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.disability.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.Disability;
import zw.ac.solusiuniversity.repository.DisabilityRepository;
import zw.ac.solusiuniversity.services.crud.disability.DisabilityCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class DisabilityCRUDServiceImpl implements DisabilityCRUDService{
    
    @Autowired
    private DisabilityRepository repository;
    
    @Override
    public List<Disability> findAll(){
        return repository.findAll();
    }

    @Override
    public void persist(Disability disability) {
        repository.save(disability);
    }

    @Override
    public void merge(Disability disability) {
        if (disability.getId() != null) {
            repository.save(disability);
        }
    }

    @Override
    public Disability findById(String id) {
        try {
            return repository.findOne(id);
        } catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(Disability disability) {
        repository.delete(disability);
    }
}