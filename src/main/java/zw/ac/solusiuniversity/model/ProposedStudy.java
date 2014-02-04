/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.model;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 *
 * @author given
 */
public class ProposedStudy implements Serializable, Comparable<ProposedStudy> {

    @Id
    private String id;
    @DBRef
    private List<Bachelor> bachelors;
    private String BEdLevel;
    private boolean fullTime;

    private ProposedStudy() {
    }

    private ProposedStudy(Builder builder) {
        this.id = builder.id;
        this.bachelors = builder.bachelors;
        this.BEdLevel = builder.BEdLevel;
        this.fullTime = builder.fullTime;
    }

    @Override
    public int compareTo(ProposedStudy o) {
        return BEdLevel.compareTo(o.BEdLevel);
    }

    public static class Builder {

        private String id;
        private List<Bachelor> bachelors;
        private final String BEdLevel;
        private boolean fullTime;

        public Builder(String value) {
            this.BEdLevel = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder bachelors(List<Bachelor> value) {
            this.bachelors = value;
            return this;
        }

        public Builder fullTime(boolean value) {
            this.fullTime = value;
            return this;
        }

        public Builder proposedStudy(ProposedStudy proposedStudy) {
            this.id = proposedStudy.getId();
            this.bachelors = proposedStudy.getBachelors();
            this.fullTime = proposedStudy.isFullTime();
            return this;
        }

        public ProposedStudy build() {
            return new ProposedStudy(this);
        }
    }

    public String getId() {
        return id;
    }

    public List<Bachelor> getBachelors() {
        return bachelors;
    }

    public String getBEdLevel() {
        return BEdLevel;
    }

    public boolean isFullTime() {
        return fullTime;
    }
}
