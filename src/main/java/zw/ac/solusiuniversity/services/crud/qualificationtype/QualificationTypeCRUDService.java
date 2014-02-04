/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.qualificationtype;

import java.util.List;
import zw.ac.solusiuniversity.model.QualificationType;

/**
 *
 * @author Luckbliss
 */
public interface QualificationTypeCRUDService {
    public QualificationType findById(String id);

    public List<QualificationType> findAll();

    public void persist(QualificationType qualificationType);

    public void merge(QualificationType qualificationType);

    public void delete(QualificationType qualificationType);
}
