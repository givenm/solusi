/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.drug.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.Drug;
import zw.ac.solusiuniversity.repository.DrugRepository;
import zw.ac.solusiuniversity.services.crud.drug.DrugCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class DrugCRUDServiceImpl implements DrugCRUDService{
    
    @Autowired
    private DrugRepository repository;
    
    @Override
    public List<Drug> findAll(){
        return repository.findAll();
    }

    @Override
    public void persist(Drug drug) {
        repository.save(drug);
    }

    @Override
    public void merge(Drug drug) {
        if (drug.getId() != null) {
            repository.save(drug);
        }
    }

    @Override
    public Drug findById(String id) {
        try {
            return repository.findOne(id);
        } catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(Drug drug) {
        repository.delete(drug);
    }
}