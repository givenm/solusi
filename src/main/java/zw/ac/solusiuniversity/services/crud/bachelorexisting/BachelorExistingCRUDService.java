/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.bachelorexisting;

import java.util.List;
import zw.ac.solusiuniversity.model.BachelorExisting;

/**
 *
 * @author Luckbliss
 */
public interface BachelorExistingCRUDService {
    public BachelorExisting findById(String id);

    public List<BachelorExisting> findAll();

    public void persist(BachelorExisting bachelorExisting);

    public void merge(BachelorExisting bachelorExisting);

    public void delete(BachelorExisting bachelorExisting);
}
