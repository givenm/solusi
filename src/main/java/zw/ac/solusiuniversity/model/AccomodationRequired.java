/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.model;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author given
 */
//Clarity
@Document
public class AccomodationRequired implements Serializable {

    @Id
    private String id;
    @DBRef
    private Accomodation accomodation;

    private AccomodationRequired() {
    }

    private AccomodationRequired(Builder builder) {
        this.id = builder.id;
        this.accomodation = builder.accomodation;
    }

//    @Override
//    public int compareTo(AccomodationRequired o) {
//        return accomodation.compare(o.accomodation);
//    }
    public static class Builder {

        private String id;
        private final Accomodation accomodation;

        public Builder(Accomodation value) {
            this.accomodation = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder accomodationRequired(AccomodationRequired accomodationRequired) {
            this.id = accomodationRequired.getId();
            return this;
        }

        public AccomodationRequired build() {
            return new AccomodationRequired(this);
        }
    }

    public String getId() {
        return id;
    }

    public Accomodation getAccomodation() {
        return accomodation;
    }
}
