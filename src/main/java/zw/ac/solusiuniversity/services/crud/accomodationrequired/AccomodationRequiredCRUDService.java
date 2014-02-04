/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.accomodationrequired;

import java.util.List;
import zw.ac.solusiuniversity.model.AccomodationRequired;

/**
 *
 * @author Luckbliss
 */
public interface AccomodationRequiredCRUDService {
    public AccomodationRequired findById(String id);

    public List<AccomodationRequired> findAll();

    public void persist(AccomodationRequired accomodationRequired);

    public void merge(AccomodationRequired accomodationRequired);

    public void delete(AccomodationRequired accomodationRequired);
}
