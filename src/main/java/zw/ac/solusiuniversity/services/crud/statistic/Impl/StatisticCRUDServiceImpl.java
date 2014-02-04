/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.statistic.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.ac.solusiuniversity.model.Statistic;
import zw.ac.solusiuniversity.repository.StatisticRepository;
import zw.ac.solusiuniversity.services.crud.statistic.StatisticCRUDService;

/**
 *
 * @author Luckbliss
 */
@Service
public class StatisticCRUDServiceImpl implements StatisticCRUDService {

    @Autowired
    private StatisticRepository repository;

    @Override
    public List<Statistic> findAll() {
        return repository.findAll();
    }

    @Override
    public void persist(Statistic statistic) {
        repository.save(statistic);
    }

    @Override
    public void merge(Statistic statistic) {
        if (statistic.getId() != null) {
            repository.save(statistic);
        }
    }

    @Override
    public Statistic findById(String id) {
        try {
            return repository.findOne(id);
        }
        catch (IllegalArgumentException iaEx) {
            return null;
        }
    }

    @Override
    public void delete(Statistic statistic) {
        repository.delete(statistic);
    }
}