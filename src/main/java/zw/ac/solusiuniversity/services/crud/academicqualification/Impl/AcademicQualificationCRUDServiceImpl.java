/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.academicqualification.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.AcademicQualification;
import zw.ac.solusiuniversity.repository.AcademicQualificationRepository;
import zw.ac.solusiuniversity.services.crud.academicqualification.AcademicQualificationCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class AcademicQualificationCRUDServiceImpl implements AcademicQualificationCRUDService{
    
    @Autowired
    private AcademicQualificationRepository repository;
    
    @Override
    public List<AcademicQualification> findAll(){
        return repository.findAll();
    }

    @Override
    public void persist(AcademicQualification academicQualification) {
        repository.save(academicQualification);
    }

    @Override
    public void merge(AcademicQualification academicQualification) {
        if (academicQualification.getId() != null) {
            repository.save(academicQualification);
        }
    }

    @Override
    public AcademicQualification findById(String id) {
        try {
            return repository.findOne(id);
        } catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(AcademicQualification academicQualification) {
        repository.delete(academicQualification);
    }
}
