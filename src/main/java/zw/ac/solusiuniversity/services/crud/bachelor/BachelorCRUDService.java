/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.bachelor;

import java.util.List;
import zw.ac.solusiuniversity.model.Bachelor;

/**
 *
 * @author Luckbliss
 */
public interface BachelorCRUDService {
    public Bachelor findById(String id);

    public List<Bachelor> findAll();

    public void persist(Bachelor bachelor);

    public void merge(Bachelor bachelor);

    public void delete(Bachelor bachelor);
}
