/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.drug;

import java.util.List;
import zw.ac.solusiuniversity.model.Drug;

/**
 *
 * @author Luckbliss
 */
public interface DrugCRUDService {
    public Drug findById(String id);

    public List<Drug> findAll();

    public void persist(Drug drug);

    public void merge(Drug drug);

    public void delete(Drug drug);
}
