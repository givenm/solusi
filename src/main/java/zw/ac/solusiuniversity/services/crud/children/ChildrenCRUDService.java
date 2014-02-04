/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.children;

import java.util.List;
import zw.ac.solusiuniversity.model.Children;

/**
 *
 * @author Luckbliss
 */
public interface ChildrenCRUDService {
    public Children findById(String id);

    public List<Children> findAll();

    public void persist(Children children);

    public void merge(Children children);

    public void delete(Children children);
}
