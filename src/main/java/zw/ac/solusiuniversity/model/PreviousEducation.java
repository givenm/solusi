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
public class PreviousEducation implements Serializable, Comparable<PreviousEducation> {

    @Id
    private String id;
    private String nameOfSchool;
    private Date startDate;
    private Date endDate;
    private String qualification;

    private PreviousEducation() {
    }

    private PreviousEducation(Builder builder) {
        this.id = builder.id;
        this.nameOfSchool = builder.nameOfSchool;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.qualification = builder.qualification;
    }

    @Override
    public int compareTo(PreviousEducation o) {
        return nameOfSchool.compareToIgnoreCase(o.nameOfSchool);
    }

    public static class Builder {

        private String id;
        private final String nameOfSchool;
        private Date startDate;
        private Date endDate;
        private String qualification;

        public Builder(String value) {
            this.nameOfSchool = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder startDate(Date value) {
            this.startDate = value;
            return this;
        }

        public Builder endDate(Date value) {
            this.endDate = value;
            return this;
        }

        public Builder qualification(String value) {
            this.qualification = value;
            return this;
        }

        public Builder previousEducation(PreviousEducation previousEducation) {
            this.id = previousEducation.getId();
            this.startDate = previousEducation.getStartDate();
            this.endDate = previousEducation.getEndDate();
            this.qualification = previousEducation.getQualification();
            return this;
        }

        public PreviousEducation build() {
            return new PreviousEducation(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getQualification() {
        return qualification;
    }
}
