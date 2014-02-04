/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.languageproficiency.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.LanguageProficiency;
import zw.ac.solusiuniversity.repository.LanguageProficiencyRepository;
import zw.ac.solusiuniversity.services.crud.languageproficiency.LanguageProficiencyCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class LanguageProficiencyCRUDServiceImpl implements LanguageProficiencyCRUDService{
    
    @Autowired
    private LanguageProficiencyRepository repository;
    
    @Override
    public List<LanguageProficiency> findAll(){
        return repository.findAll();
    }

    @Override
    public void persist(LanguageProficiency languageProficiency) {
        repository.save(languageProficiency);
    }

    @Override
    public void merge(LanguageProficiency languageProficiency) {
        if (languageProficiency.getId() != null) {
            repository.save(languageProficiency);
        }
    }

    @Override
    public LanguageProficiency findById(String id) {
        try {
            return repository.findOne(id);
        } catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(LanguageProficiency languageProficiency) {
        repository.delete(languageProficiency);
    }
}