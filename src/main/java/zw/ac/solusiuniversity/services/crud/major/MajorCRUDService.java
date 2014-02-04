/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.major;

import java.util.List;
import zw.ac.solusiuniversity.model.Major;

/**
 *
 * @author Luckbliss
 */
public interface MajorCRUDService {
    public Major findById(String id);

    public List<Major> findAll();

    public void persist(Major major);

    public void merge(Major major);

    public void delete(Major major);
}
