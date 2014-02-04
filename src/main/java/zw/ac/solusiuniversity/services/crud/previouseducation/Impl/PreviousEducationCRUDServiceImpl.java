/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.previouseducation.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.PreviousEducation;
import zw.ac.solusiuniversity.repository.PreviousEducationRepository;
import zw.ac.solusiuniversity.services.crud.previouseducation.PreviousEducationCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class PreviousEducationCRUDServiceImpl implements PreviousEducationCRUDService {

    @Autowired
    private PreviousEducationRepository repository;

    @Override
    public List<PreviousEducation> findAll() {
        return repository.findAll();
    }

    @Override
    public void persist(PreviousEducation previousEducation) {
        repository.save(previousEducation);
    }

    @Override
    public void merge(PreviousEducation previousEducation) {
        if (previousEducation.getId() != null) {
            repository.save(previousEducation);
        }
    }

    @Override
    public PreviousEducation findById(String id) {
        try {
            return repository.findOne(id);
        }
        catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(PreviousEducation persPreviousEducationon) {
        repository.delete(persPreviousEducationon);
    }
}