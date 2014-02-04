/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.academicresult.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.AcademicResult;
import zw.ac.solusiuniversity.repository.AcademicResultRepository;
import zw.ac.solusiuniversity.services.crud.academicresult.AcademicResultCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class AcademicResultCRUDServiceImpl implements AcademicResultCRUDService{
    
    @Autowired
    private AcademicResultRepository repository;
    
    @Override
    public List<AcademicResult> findAll(){
        return repository.findAll();
    }

    @Override
    public void persist(AcademicResult academicResult) {
        repository.save(academicResult);
    }

    @Override
    public void merge(AcademicResult academicResult) {
        if (academicResult.getId() != null) {
            repository.save(academicResult);
        }
    }

    @Override
    public AcademicResult findById(String id) {
        try {
            return repository.findOne(id);
        } catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(AcademicResult academicResult) {
        repository.delete(academicResult);
    }
}
