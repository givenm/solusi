/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.bachelor.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.Bachelor;
import zw.ac.solusiuniversity.repository.BachelorRepository;
import zw.ac.solusiuniversity.services.crud.bachelor.BachelorCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class BachelorCRUDServiceImpl implements BachelorCRUDService{
    
    @Autowired
    private BachelorRepository repository;
    
    @Override
    public List<Bachelor> findAll(){
        return repository.findAll();
    }

    @Override
    public void persist(Bachelor bachelor) {
        repository.save(bachelor);
    }

    @Override
    public void merge(Bachelor bachelor) {
        if (bachelor.getId() != null) {
            repository.save(bachelor);
        }
    }

    @Override
    public Bachelor findById(String id) {
        try {
            return repository.findOne(id);
        } catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(Bachelor bachelor) {
        repository.delete(bachelor);
    }
}
