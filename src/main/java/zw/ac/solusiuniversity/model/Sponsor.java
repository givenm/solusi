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
public class Sponsor implements Serializable, Comparable<Sponsor> {

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

    private Sponsor() {
    }

    private Sponsor(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.name = builder.name;
        this.houseNumber = builder.houseNumber;
        this.street = builder.street;
        this.town = builder.town;
        this.country = builder.country;
        this.telephone = builder.telephone;
        this.cellNumber = builder.cellNumber;
        this.email = builder.email;
    }

    @Override
    public int compareTo(Sponsor o) {
        return name.compareTo(o.name);
    }

    public static class Builder {

        private String id;
        private String title;
        private final String name;
        private String houseNumber;
        private String street;
        private String town;
        private String country;
        private String telephone;
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

        public Builder telephone(String value) {
            this.telephone = value;
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

        public Builder sponsor(Sponsor sponsor) {
            this.id = sponsor.getId();
            this.title = sponsor.getTitle();
            this.houseNumber = sponsor.getHouseNumber();
            this.street = sponsor.getStreet();
            this.town = sponsor.getTown();
            this.country = sponsor.getCountry();
            this.telephone = sponsor.getTelephone();
            this.cellNumber = sponsor.getCellNumber();
            this.email = sponsor.getEmail();
            return this;
        }

        public Sponsor build() {
            return new Sponsor(this);
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

    public String getTelephone() {
        return telephone;
    }

    public int getCellNumber() {
        return cellNumber;
    }

    public String getEmail() {
        return email;
    }
}
