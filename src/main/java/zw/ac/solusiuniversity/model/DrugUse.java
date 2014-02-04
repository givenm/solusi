/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author given
 */
@Document
public class DrugUse implements Serializable, Comparable<DrugUse> {

    @Id
    private String id;
    private String status;
    @DBRef
    private Set<Drug> drugs;

    private DrugUse() {
    }

    private DrugUse(Builder builder) {
        this.id = builder.id;
        this.status = builder.status;
        this.drugs = builder.drugs;
    }

    @Override
    public int compareTo(DrugUse o) {
        return status.compareToIgnoreCase(o.status);
    }

    public static class Builder {

        private String id;
        private final String status;
        private Set<Drug> drugs;

        public Builder(String value) {
            this.status = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder drugs(Set<Drug> value) {
            this.drugs = value;
            return this;
        }

        public Builder drugUse(DrugUse drugUse) {
            this.id = drugUse.getId();
            this.drugs = drugUse.getDrugs();
            return this;
        }

        public DrugUse build() {
            return new DrugUse(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public Set<Drug> getDrugs() {
        return drugs;
    }
}
