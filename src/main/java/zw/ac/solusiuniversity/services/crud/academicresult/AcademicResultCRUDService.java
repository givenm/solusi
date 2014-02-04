/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.academicresult;

import java.util.List;
import zw.ac.solusiuniversity.model.AcademicResult;

/**
 *
 * @author Luckbliss
 */
public interface AcademicResultCRUDService {
    public AcademicResult findById(String id);

    public List<AcademicResult> findAll();

    public void persist(AcademicResult academicResult);

    public void merge(AcademicResult academicResult);

    public void delete(AcademicResult academicResult);
}
