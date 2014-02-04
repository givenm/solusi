/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.services.crud.languageproficiency;

import java.util.List;
import zw.ac.solusiuniversity.model.LanguageProficiency;

/**
 *
 * @author Luckbliss
 */
public interface LanguageProficiencyCRUDService {
    public LanguageProficiency findById(String id);

    public List<LanguageProficiency> findAll();

    public void persist(LanguageProficiency languageProficiency);

    public void merge(LanguageProficiency languageProficiency);

    public void delete(LanguageProficiency languageProficiency);
}
