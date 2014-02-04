/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.druguse.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.DrugUse;
import zw.ac.solusiuniversity.repository.DrugUseRepository;
import zw.ac.solusiuniversity.services.crud.druguse.DrugUseCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class DrugUseCRUDServiceImpl implements DrugUseCRUDService{
    
    @Autowired
    private DrugUseRepository repository;
    
    @Override
    public List<DrugUse> findAll(){
        return repository.findAll();
    }

    @Override
    public void persist(DrugUse drugUse) {
        repository.save(drugUse);
    }

    @Override
    public void merge(DrugUse drugUse) {
        if (drugUse.getId() != null) {
            repository.save(drugUse);
        }
    }

    @Override
    public DrugUse findById(String id) {
        try {
            return repository.findOne(id);
        } catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(DrugUse drugUse) {
        repository.delete(drugUse);
    }
}