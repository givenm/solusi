/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.employmenthistory.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.EmploymentHistory;
import zw.ac.solusiuniversity.repository.EmploymentHistoryRepository;
import zw.ac.solusiuniversity.services.crud.employmenthistory.EmploymentHistoryCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class EmploymentHistoryCRUDServiceImpl implements EmploymentHistoryCRUDService{
    
    @Autowired
    private EmploymentHistoryRepository repository;
    
    @Override
    public List<EmploymentHistory> findAll(){
        return repository.findAll();
    }

    @Override
    public void persist(EmploymentHistory employmentHistory) {
        repository.save(employmentHistory);
    }

    @Override
    public void merge(EmploymentHistory employmentHistory) {
        if (employmentHistory.getId() != null) {
            repository.save(employmentHistory);
        }
    }

    @Override
    public EmploymentHistory findById(String id) {
        try {
            return repository.findOne(id);
        } catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(EmploymentHistory employmentHistory) {
        repository.delete(employmentHistory);
    }
}