/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.statistic;

import java.util.List;
import zw.ac.solusiuniversity.model.Statistic;

/**
 *
 * @author Luckbliss
 */
public interface StatisticCRUDService {
    public Statistic findById(String id);

    public List<Statistic> findAll();

    public void persist(Statistic statistic);

    public void merge(Statistic statistic);

    public void delete(Statistic statistic);
}
