/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.major.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.Major;
import zw.ac.solusiuniversity.repository.MajorRepository;
import zw.ac.solusiuniversity.services.crud.major.MajorCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class MajorCRUDServiceImpl implements MajorCRUDService{
    
    @Autowired
    private MajorRepository repository;
    
    @Override
    public List<Major> findAll(){
        return repository.findAll();
    }

    @Override
    public void persist(Major major) {
        repository.save(major);
    }

    @Override
    public void merge(Major major) {
        if (major.getId() != null) {
            repository.save(major);
        }
    }

    @Override
    public Major findById(String id) {
        try {
            return repository.findOne(id);
        } catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(Major major) {
        repository.delete(major);
    }
}