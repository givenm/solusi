/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.children.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.Children;
import zw.ac.solusiuniversity.repository.ChildrenRepository;
import zw.ac.solusiuniversity.services.crud.children.ChildrenCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class ChildrenCRUDServiceImpl implements ChildrenCRUDService{
    
    @Autowired
    private ChildrenRepository repository;
    
    @Override
    public List<Children> findAll(){
        return repository.findAll();
    }

    @Override
    public void persist(Children children) {
        repository.save(children);
    }

    @Override
    public void merge(Children children) {
        if (children.getId() != null) {
            repository.save(children);
        }
    }

    @Override
    public Children findById(String id) {
        try {
            return repository.findOne(id);
        } catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(Children children) {
        repository.delete(children);
    }
}