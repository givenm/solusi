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
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author given
 */
@Document
public class Spouse implements Serializable, Comparable<Spouse> {

    @Id
    private String id;
    private String spouseName;
    private Set<Children> children;

    private Spouse() {
    }

    private Spouse(Builder builder) {
        this.id = builder.id;
        this.spouseName = builder.spouseName;
        this.children = builder.children;
    }

    @Override
    public int compareTo(Spouse o) {
        return spouseName.compareTo(o.spouseName);
    }

    public static class Builder {

        private String id;
        private String spouseName;
        private Set<Children> children;

        public Builder(String value) {
            this.spouseName = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder children(Set<Children> value) {
            this.children = value;
            return this;
        }

        public Builder spouse(Spouse spouse) {
            this.id = spouse.getId();
            this.children = spouse.getChildren();
            return this;
        }

        public Spouse build() {
            return new Spouse(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public Set<Children> getChildren() {
        return children;
    }
}
