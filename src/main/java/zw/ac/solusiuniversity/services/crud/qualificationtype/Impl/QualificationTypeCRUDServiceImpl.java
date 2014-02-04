/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.qualificationtype.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.QualificationType;
import zw.ac.solusiuniversity.repository.QualificationTypeRepository;
import zw.ac.solusiuniversity.services.crud.qualificationtype.QualificationTypeCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class QualificationTypeCRUDServiceImpl implements QualificationTypeCRUDService {

    @Autowired
    private QualificationTypeRepository repository;

    @Override
    public List<QualificationType> findAll() {
        return repository.findAll();
    }

    @Override
    public void persist(QualificationType qualificationType) {
        repository.save(qualificationType);
    }

    @Override
    public void merge(QualificationType qualificationType) {
        if (qualificationType.getId() != null) {
            repository.save(qualificationType);
        }
    }

    @Override
    public QualificationType findById(String id) {
        try {
            return repository.findOne(id);
        }
        catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(QualificationType qualificationType) {
        repository.delete(qualificationType);
    }
}