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
class Children {

    @Id
    private String id;
    private String name;
    private String sex;
    private int age;
    private String levelType;
    private String level;
    private Date dob;
    private String placeOfBirth;

}
