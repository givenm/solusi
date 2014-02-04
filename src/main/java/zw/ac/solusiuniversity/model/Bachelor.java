/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.model;

import java.io.Serializable;
import java.util.Set;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author given
 */
//Clarity
@Document
public class Bachelor implements Serializable {

    @Id
    private String id;
    private BachelorExisting type;
    private Set<Major> majors;

    private Bachelor() {
    }

    private Bachelor(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.majors = builder.majors;
    }

//    @Override
//    public int compareTo(AccomodationRequired o) {
//        return accomodation.compare(o.accomodation);
//    }
    public static class Builder {

        private String id;
        private final BachelorExisting type;
        private Set<Major> majors;

        public Builder(BachelorExisting value) {
            this.type = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }
        public Builder majors(Set<Major> value) {
            this.majors = value;
            return this;
        }

        public Builder bachelor(Bachelor bachelor) {
            this.id = bachelor.getId();
            this.majors = bachelor.getMajors();
            return this;
        }

        public Bachelor build() {
            return new Bachelor(this);
        }
    }

    public String getId() {
        return id;
    }

    public BachelorExisting getType() {
        return type;
    }

    public Set<Major> getMajors() {
        return majors;
    }
}
