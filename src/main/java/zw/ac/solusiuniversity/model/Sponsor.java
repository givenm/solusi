/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zw.ac.solusiuniversity.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author given
 */
@Document
class Sponsor {
    @Id
    private String id;
    private String title;
    private String name;
    private String houseNumber;
    private String street;
    private String town;
    private String country;
    private String telephone;
    private int cellNumber;
    private String email;
    
    
}
