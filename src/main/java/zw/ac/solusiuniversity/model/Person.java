/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.ac.solusiuniversity.model;

import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author given
 */
@Document
public class Person {
    @Id
    private String id;
    private String firstname;
    private String middlename;
    private String lastname;
    private String maritalStatus;
    private Date dateOfBirth;
    private String gender;
    @DBRef
    private Contact address;
    private boolean nationality;
    private String otherNationality;
    private boolean citizenship;
    private String otherCitizenship;
    private String religion;
    private String dinomination;
    @DBRef
    private EmergencyContact emergencyContact;
    @DBRef
    private DrugUse drugUse;
    @DBRef
    private LanguageProficiency languageProficiency;
    @DBRef
    private List<PreviousEducation> previousEducation;
    @DBRef
    private ProposedStudy proposedStudy;
    @DBRef
    private AcademicResult academicResults;
    
}
