/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.previoustrainingtype.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.PreviousTrainingType;
import zw.ac.solusiuniversity.repository.PreviousTrainingTypeRepository;
import zw.ac.solusiuniversity.services.crud.previoustrainingtype.PreviousTrainingTypeCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class PreviousTrainingTypeCRUDServiceImpl implements PreviousTrainingTypeCRUDService {

    @Autowired
    private PreviousTrainingTypeRepository repository;

    @Override
    public List<PreviousTrainingType> findAll() {
        return repository.findAll();
    }

    @Override
    public void persist(PreviousTrainingType previousTrainingType) {
        repository.save(previousTrainingType);
    }

    @Override
    public void merge(PreviousTrainingType previousTrainingType) {
        if (previousTrainingType.getId() != null) {
            repository.save(previousTrainingType);
        }
    }

    @Override
    public PreviousTrainingType findById(String id) {
        try {
            return repository.findOne(id);
        }
        catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(PreviousTrainingType previousTrainingType) {
        repository.delete(previousTrainingType);
    }
}