/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.ac.solusiuniversity.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author given
 */
@Document
public class EmploymentHistory {
    @Id
    private String id;
    private Date from;
    private Date to;
    private String nameOfEmployer;
    private String addressOfEmployer;
    private String postHeld;
    private String description;
    
}
