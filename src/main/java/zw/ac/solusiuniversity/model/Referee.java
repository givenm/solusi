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
public class Referee implements Serializable, Comparable<Referee> {

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

    private Referee() {
    }

    private Referee(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.title = builder.title;
        this.address = builder.address;
        this.telephoneNumber = builder.telephoneNumber;
        this.faxNumber = builder.faxNumber;
        this.email = builder.email;
        this.lengthOfTimeKnown = builder.lengthOfTimeKnown;
        this.relationship = builder.relationship;
    }

    @Override
    public int compareTo(Referee o) {
        return name.compareTo(o.name);
    }

    public static class Builder {

        private String id;
        private final String name;
        private String title;
        private String address;
        private String telephoneNumber;
        private String faxNumber;
        private String email;
        private String lengthOfTimeKnown;
        private String relationship;

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

        public Builder address(String value) {
            this.address = value;
            return this;
        }

        public Builder telephoneNumber(String value) {
            this.telephoneNumber = value;
            return this;
        }

        public Builder faxNumber(String value) {
            this.faxNumber = value;
            return this;
        }

        public Builder email(String value) {
            this.email = value;
            return this;
        }

        public Builder lengthOfTimeKnown(String value) {
            this.lengthOfTimeKnown = value;
            return this;
        }

        public Builder relationship(String value) {
            this.relationship = value;
            return this;
        }

        public Builder referee(Referee referee) {
            this.id = referee.getId();
            this.title = referee.getTitle();
            this.address = referee.getAddress();
            this.telephoneNumber = referee.getTelephoneNumber();
            this.faxNumber = referee.getFaxNumber();
            this.email = referee.getEmail();
            this.lengthOfTimeKnown = referee.getLengthOfTimeKnown();
            this.relationship = referee.getRelationship();
            return this;
        }

        public Referee build() {
            return new Referee(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getLengthOfTimeKnown() {
        return lengthOfTimeKnown;
    }

    public String getRelationship() {
        return relationship;
    }
}
