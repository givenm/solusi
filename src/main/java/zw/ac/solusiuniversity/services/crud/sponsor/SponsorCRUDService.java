/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.sponsor;

import java.util.List;
import zw.ac.solusiuniversity.model.Sponsor;

/**
 *
 * @author Luckbliss
 */
public interface SponsorCRUDService {
    public Sponsor findById(String id);

    public List<Sponsor> findAll();

    public void persist(Sponsor sponsor);

    public void merge(Sponsor sponsor);

    public void delete(Sponsor sponsor);
}
