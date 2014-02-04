/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.emergencycontact;

import java.util.List;
import zw.ac.solusiuniversity.model.EmergencyContact;

/**
 *
 * @author Luckbliss
 */
public interface EmergencyContactCRUDService {
    public EmergencyContact findById(String id);

    public List<EmergencyContact> findAll();

    public void persist(EmergencyContact emergencyContact);

    public void merge(EmergencyContact emergencyContact);

    public void delete(EmergencyContact emergencyContact);
}
