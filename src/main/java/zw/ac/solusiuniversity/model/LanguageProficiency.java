/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.ac.solusiuniversity.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author given
 */
@Document
public class LanguageProficiency {
    @Id
    private String id;
    private boolean english;
    private boolean previousEducationInEnglish;
    private String previousEducationLanguage;
    private String firstSpockenLanguage;
    private boolean attendedBefore;
    @DBRef
    private List<PreviousTrainingType> previousTrainingTypes;
    
}
