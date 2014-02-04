/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.sponsor.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.Sponsor;
import zw.ac.solusiuniversity.repository.SponsorRepository;
import zw.ac.solusiuniversity.services.crud.sponsor.SponsorCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class SponsorCRUDServiceImpl implements SponsorCRUDService {

    @Autowired
    private SponsorRepository repository;

    @Override
    public List<Sponsor> findAll() {
        return repository.findAll();
    }

    @Override
    public void persist(Sponsor sponsor) {
        repository.save(sponsor);
    }

    @Override
    public void merge(Sponsor sponsor) {
        if (sponsor.getId() != null) {
            repository.save(sponsor);
        }
    }

    @Override
    public Sponsor findById(String id) {
        try {
            return repository.findOne(id);
        }
        catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(Sponsor sponsor) {
        repository.delete(sponsor);
    }
}