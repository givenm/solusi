/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.academicqualification;

import java.util.List;
import zw.ac.solusiuniversity.model.AcademicQualification;

/**
 *
 * @author Luckbliss
 */
public interface AcademicQualificationCRUDService {

    public AcademicQualification findById(String id);

    public List<AcademicQualification> findAll();

    public void persist(AcademicQualification academicQualification);

    public void merge(AcademicQualification academicQualification);

    public void delete(AcademicQualification academicQualification);
}
