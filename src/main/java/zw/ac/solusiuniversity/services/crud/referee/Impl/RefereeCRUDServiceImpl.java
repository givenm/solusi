/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.referee.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.Referee;
import zw.ac.solusiuniversity.repository.RefereeRepository;
import zw.ac.solusiuniversity.services.crud.referee.RefereeCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class RefereeCRUDServiceImpl implements RefereeCRUDService {

    @Autowired
    private RefereeRepository repository;

    @Override
    public List<Referee> findAll() {
        return repository.findAll();
    }

    @Override
    public void persist(Referee referee) {
        repository.save(referee);
    }

    @Override
    public void merge(Referee referee) {
        if (referee.getId() != null) {
            repository.save(referee);
        }
    }

    @Override
    public Referee findById(String id) {
        try {
            return repository.findOne(id);
        }
        catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(Referee referee) {
        repository.delete(referee);
    }
}