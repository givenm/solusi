/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.proposedstudy.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.ProposedStudy;
import zw.ac.solusiuniversity.repository.ProposedStudyRepository;
import zw.ac.solusiuniversity.services.crud.proposedstudy.ProposedStudyCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class ProposedStudyCRUDServiceImpl implements ProposedStudyCRUDService {

    @Autowired
    private ProposedStudyRepository repository;

    @Override
    public List<ProposedStudy> findAll() {
        return repository.findAll();
    }

    @Override
    public void persist(ProposedStudy proposedStudy) {
        repository.save(proposedStudy);
    }

    @Override
    public void merge(ProposedStudy proposedStudy) {
        if (proposedStudy.getId() != null) {
            repository.save(proposedStudy);
        }
    }

    @Override
    public ProposedStudy findById(String id) {
        try {
            return repository.findOne(id);
        }
        catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(ProposedStudy proposedStudy) {
        repository.delete(proposedStudy);
    }
}