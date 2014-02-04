/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.model;

import java.io.Serializable;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author given
 */
@Document
public class EmploymentHistory implements Serializable, Comparable<EmploymentHistory> {

    @Id
    private String id;
    private Date from;
    private Date to;
    private String nameOfEmployer;
    private String addressOfEmployer;
    private String postHeld;
    private String description;

    private EmploymentHistory() {
    }

    private EmploymentHistory(Builder builder) {
        this.id = builder.id;
        this.from = builder.from;
        this.to = builder.to;
        this.nameOfEmployer = builder.nameOfEmployer;
        this.addressOfEmployer = builder.addressOfEmployer;
        this.postHeld = builder.postHeld;
        this.description = builder.description;
    }

    @Override
    public int compareTo(EmploymentHistory o) {
        return nameOfEmployer.compareToIgnoreCase(o.nameOfEmployer);
    }

    public static class Builder {

        private String id;
        private Date from;
        private Date to;
        private final String nameOfEmployer;
        private String addressOfEmployer;
        private String postHeld;
        private String description;

        public Builder(String value) {
            this.nameOfEmployer = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder from(Date value) {
            this.from = value;
            return this;
        }

        public Builder to(Date value) {
            this.to = value;
            return this;
        }

        public Builder addressOfEmployer(String value) {
            this.addressOfEmployer = value;
            return this;
        }

        public Builder postHeld(String value) {
            this.postHeld = value;
            return this;
        }

        public Builder description(String value) {
            this.postHeld = value;
            return this;
        }

        public Builder employmentHistory(EmploymentHistory employmentHistory) {
            this.id = employmentHistory.getId();
            this.from = employmentHistory.getFrom();
            this.to = employmentHistory.getTo();
            this.addressOfEmployer = employmentHistory.getAddressOfEmployer();
            this.postHeld = employmentHistory.getPostHeld();
            this.description = employmentHistory.getDescription();
            return this;
        }

        public EmploymentHistory build() {
            return new EmploymentHistory(this);
        }
    }

    public String getId() {
        return id;
    }

    public Date getFrom() {
        return from;
    }

    public Date getTo() {
        return to;
    }

    public String getNameOfEmployer() {
        return nameOfEmployer;
    }

    public String getAddressOfEmployer() {
        return addressOfEmployer;
    }

    public String getPostHeld() {
        return postHeld;
    }

    public String getDescription() {
        return description;
    }
}
