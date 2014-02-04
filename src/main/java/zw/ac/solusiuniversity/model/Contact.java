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
public class Contact implements Serializable, Comparable<Contact> {

    @Id
    private String id;
    private String title;
    private String name;
    private String houseNumber;
    private String street;
    private String town;
    private String country;
    private int telephone;
    private int cellNumber;
    private String email;

    private Contact() {
    }

    private Contact(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.title = builder.title;
        this.houseNumber = builder.houseNumber;
        this.street = builder.street;
        this.town = builder.town;
        this.country = builder.country;
        this.telephone = builder.telephone;
        this.cellNumber = builder.cellNumber;
        this.email = builder.email;
    }

    @Override
    public int compareTo(Contact o) {
        return name.compareToIgnoreCase(o.name);
    }

    public static class Builder {

        private String id;
        private String title;
        private final String name;
        private String houseNumber;
        private String street;
        private String town;
        private String country;
        private int telephone;
        private int cellNumber;
        private String email;

        public Builder(String value) {
            this.name = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder title(String value) {
            this.title = value;
            return this;
        }

        public Builder houseNumber(String value) {
            this.houseNumber = value;
            return this;
        }

        public Builder street(String value) {
            this.street = value;
            return this;
        }

        public Builder town(String value) {
            this.town = value;
            return this;
        }

        public Builder country(String value) {
            this.country = value;
            return this;
        }

        public Builder cellNumber(int value) {
            this.cellNumber = value;
            return this;
        }

        public Builder email(String value) {
            this.email = value;
            return this;
        }

        public Builder telephone(int value) {
            this.telephone = value;
            return this;
        }

        public Builder contact(Contact contact) {
            this.id = contact.getId();
            this.title = contact.getTitle();
            this.houseNumber = contact.getHouseNumber();
            this.street = contact.getStreet();
            this.town = contact.getTown();
            this.country = contact.getCountry();
            this.telephone = contact.getTelephone();
            this.cellNumber = contact.getCellNumber();
            this.email = contact.getEmail();
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getTown() {
        return town;
    }

    public String getCountry() {
        return country;
    }

    public int getTelephone() {
        return telephone;
    }

    public int getCellNumber() {
        return cellNumber;
    }

    public String getEmail() {
        return email;
    }
}
