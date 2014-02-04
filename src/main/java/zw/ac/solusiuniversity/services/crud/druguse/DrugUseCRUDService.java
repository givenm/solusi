/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.druguse;

import java.util.List;
import zw.ac.solusiuniversity.model.DrugUse;

/**
 *
 * @author Luckbliss
 */
public interface DrugUseCRUDService {
    public DrugUse findById(String id);

    public List<DrugUse> findAll();

    public void persist(DrugUse drugUse);

    public void merge(DrugUse drugUse);

    public void delete(DrugUse drugUse);
}
