/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.employmenthistory;

import java.util.List;
import zw.ac.solusiuniversity.model.EmploymentHistory;

/**
 *
 * @author Luckbliss
 */
public interface EmploymentHistoryCRUDService {
    public EmploymentHistory findById(String id);

    public List<EmploymentHistory> findAll();

    public void persist(EmploymentHistory employmentHistory);

    public void merge(EmploymentHistory employmentHistory);

    public void delete(EmploymentHistory employmentHistory);
}
