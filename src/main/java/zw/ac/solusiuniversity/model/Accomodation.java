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
public class Accomodation implements Serializable, Comparable<Accomodation> {

    @Id
    private String id;
    private String accomodationType;

    private Accomodation() {
    }

    private Accomodation(Builder builder) {
        this.id = builder.id;
        this.accomodationType = builder.accomodationType;
    }

    @Override
    public int compareTo(Accomodation o) {
        return accomodationType.compareToIgnoreCase(o.accomodationType);
    }

    public static class Builder {

        private String id;
        private final String accomodationType;

        public Builder(String value) {
            this.accomodationType = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder accomodation(Accomodation accomodation) {
            this.id = accomodation.getId();
            return this;
        }

        public Accomodation build() {
            return new Accomodation(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getAccomodationType() {
        return accomodationType;
    }
}
