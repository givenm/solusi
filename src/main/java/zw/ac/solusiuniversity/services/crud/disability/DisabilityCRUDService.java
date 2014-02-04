/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.disability;

import java.util.List;
import zw.ac.solusiuniversity.model.Disability;

/**
 *
 * @author Luckbliss
 */
public interface DisabilityCRUDService {
    public Disability findById(String id);

    public List<Disability> findAll();

    public void persist(Disability disability);

    public void merge(Disability disability);

    public void delete(Disability disability);
}
