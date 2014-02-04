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
public class Drug implements Serializable, Comparable<Drug> {

    @Id
    private String id;
    private String drugName;
    private String name;
    private String houseNumber;
    private String street;

    private Drug() {
    }

    private Drug(Builder builder) {
        this.id = builder.id;
        this.drugName = builder.drugName;
        this.name = builder.name;
        this.houseNumber = builder.houseNumber;
        this.street = builder.street;
    }

    @Override
    public int compareTo(Drug o) {
        return name.compareToIgnoreCase(o.name);
    }

    public static class Builder {

        private String id;
        private String drugName;
        private final String name;
        private String houseNumber;
        private String street;

        public Builder(String name) {
            this.name = name;
        }

        public Builder drugName(String name) {
            this.drugName = name;
            return this;
        }

        public Builder houseNumber(String name) {
            this.houseNumber = name;
            return this;
        }

        public Builder street(String name) {
            this.street = name;
            return this;
        }

        public Builder drug(Drug drug) {
            this.id = drug.getId();
            this.drugName = drug.getDrugName();
            this.houseNumber = drug.getHouseNumber();
            return this;
        }

        public Drug build() {
            return new Drug(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getDrugName() {
        return drugName;
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
}
