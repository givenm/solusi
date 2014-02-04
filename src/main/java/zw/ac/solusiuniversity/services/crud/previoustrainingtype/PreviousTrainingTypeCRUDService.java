/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.previoustrainingtype;

import java.util.List;
import zw.ac.solusiuniversity.model.PreviousTrainingType;

/**
 *
 * @author Luckbliss
 */
public interface PreviousTrainingTypeCRUDService {
    public PreviousTrainingType findById(String id);

    public List<PreviousTrainingType> findAll();

    public void persist(PreviousTrainingType previousTrainingType);

    public void merge(PreviousTrainingType previousTrainingType);

    public void delete(PreviousTrainingType previousTrainingType);
}
