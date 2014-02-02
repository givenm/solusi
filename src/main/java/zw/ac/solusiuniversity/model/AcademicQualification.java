/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.ac.solusiuniversity.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author given
 */

@Document
class AcademicQualification {
    @Id
    private String id;
    @DBRef
    private QualificationType qualificationType;
    private String subjectName;
    private String grade;    
    
}
