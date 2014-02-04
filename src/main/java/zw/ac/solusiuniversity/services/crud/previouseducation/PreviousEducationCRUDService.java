/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.previouseducation;

import java.util.List;
import zw.ac.solusiuniversity.model.PreviousEducation;

/**
 *
 * @author Luckbliss
 */
public interface PreviousEducationCRUDService {
    public PreviousEducation findById(String id);

    public List<PreviousEducation> findAll();

    public void persist(PreviousEducation previousEducation);

    public void merge(PreviousEducation previousEducation);

    public void delete(PreviousEducation previousEducation);
}
