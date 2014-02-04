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
public class Statistic implements Serializable, Comparable<Statistic> {

    @Id
    private String id;
    private String description;

    private Statistic() {
    }

    private Statistic(Builder builder) {
        this.id = builder.id;
        this.description = builder.description;
    }

    @Override
    public int compareTo(Statistic o) {
        return description.compareTo(o.description);
    }

    public static class Builder {

        private String id;
        private final String description;

        public Builder(String value) {
            this.description = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder statistic(Statistic statistic) {
            this.id = statistic.getId();
            return this;
        }

        public Statistic build() {
            return new Statistic(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
