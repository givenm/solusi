/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.spouse;

import java.util.List;
import zw.ac.solusiuniversity.model.Spouse;

/**
 *
 * @author Luckbliss
 */
public interface SpouseCRUDService {
    public Spouse findById(String id);

    public List<Spouse> findAll();

    public void persist(Spouse spouse);

    public void merge(Spouse spouse);

    public void delete(Spouse spouse);
}
