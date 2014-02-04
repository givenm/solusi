/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.spouse.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.Spouse;
import zw.ac.solusiuniversity.repository.SpouseRepository;
import zw.ac.solusiuniversity.services.crud.spouse.SpouseCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class SpouseCRUDServiceImpl implements SpouseCRUDService {

    @Autowired
    private SpouseRepository repository;

    @Override
    public List<Spouse> findAll() {
        return repository.findAll();
    }

    @Override
    public void persist(Spouse spouse) {
        repository.save(spouse);
    }

    @Override
    public void merge(Spouse spouse) {
        if (spouse.getId() != null) {
            repository.save(spouse);
        }
    }

    @Override
    public Spouse findById(String id) {
        try {
            return repository.findOne(id);
        }
        catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(Spouse spouse) {
        repository.delete(spouse);
    }
}