/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.accomodation;

import java.util.List;
import zw.ac.solusiuniversity.model.Accomodation;

/**
 *
 * @author Luckbliss
 */
public interface AccomodationCRUDService {
    public Accomodation findById(String id);

    public List<Accomodation> findAll();

    public void persist(Accomodation accomodation);

    public void merge(Accomodation accomodation);

    public void delete(Accomodation accomodation);
}
