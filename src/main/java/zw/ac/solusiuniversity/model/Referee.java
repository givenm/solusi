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
class Referee {
    @Id
    private String id;
    private String name;
    private String title;
    private String address;
    private String telephoneNumber;
    private String faxNumber;
    private String email;
    private String lengthOfTimeKnown;
    private String relationship;
}
