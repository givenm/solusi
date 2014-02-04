/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.referee;

import java.util.List;
import zw.ac.solusiuniversity.model.Referee;

/**
 *
 * @author Luckbliss
 */
public interface RefereeCRUDService {
    public Referee findById(String id);

    public List<Referee> findAll();

    public void persist(Referee referee);

    public void merge(Referee referee);

    public void delete(Referee referee);
}
