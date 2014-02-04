/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.model;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author given
 */
@Document
public class EmergencyContact implements Serializable, Comparable<EmergencyContact> {

    @Id
    private String id;
    private String name;
    private String address;
    private String telephoneNumber;
    private String relationship;

    private EmergencyContact() {
    }

    private EmergencyContact(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
        this.telephoneNumber = builder.telephoneNumber;
        this.relationship = builder.relationship;
    }

    @Override
    public int compareTo(EmergencyContact o) {
        return name.compareToIgnoreCase(o.name);
    }

    public static class Builder {

        private String id;
        private final String name;
        private String address;
        private String telephoneNumber;
        private String relationship;

        public Builder(String value) {
            this.name = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder address(String value) {
            this.address = value;
            return this;
        }

        public Builder telephoneNumber(String value) {
            this.telephoneNumber = value;
            return this;
        }

        public Builder relationship(String value) {
            this.relationship = value;
            return this;
        }

        public Builder emergencyContact(EmergencyContact emergencyContact) {
            this.id = emergencyContact.getId();
            this.address = emergencyContact.getAddress();
            this.telephoneNumber = emergencyContact.getTelephoneNumber();
            this.relationship = emergencyContact.getRelationship();
            return this;
        }

        public EmergencyContact build() {
            return new EmergencyContact(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getRelationship() {
        return relationship;
    }
}
