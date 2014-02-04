/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.proposedstudy;

import java.util.List;
import zw.ac.solusiuniversity.model.ProposedStudy;

/**
 *
 * @author Luckbliss
 */
public interface ProposedStudyCRUDService {
    public ProposedStudy findById(String id);

    public List<ProposedStudy> findAll();

    public void persist(ProposedStudy proposedStudy);

    public void merge(ProposedStudy proposedStudy);

    public void delete(ProposedStudy proposedStudy);
}
