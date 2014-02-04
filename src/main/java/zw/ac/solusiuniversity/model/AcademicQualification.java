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
@Document
public class AcademicQualification implements Serializable, Comparable<AcademicQualification> {

    @Id
    private String id;
    @DBRef
    private QualificationType qualificationType;
    private String subjectName;
    private String grade;

    private AcademicQualification() {
    }

    private AcademicQualification(Builder builder) {
        this.id = builder.id;
        this.qualificationType = builder.qualificationType;
        this.subjectName = builder.subjectName;
        this.grade = builder.grade;
    }

    @Override
    public int compareTo(AcademicQualification o) {
        return subjectName.compareToIgnoreCase(o.subjectName);
    }

    public static class Builder {

        private String id;
        private QualificationType qualificationType;
        private final String subjectName;
        private String grade;

        public Builder(String value) {
            this.subjectName = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder qualificationType(QualificationType value) {
            this.qualificationType = value;
            return this;
        }

        public Builder grade(String value) {
            this.grade = value;
            return this;
        }

        public Builder qualification(AcademicQualification qualification) {
            this.id = qualification.getId();
            this.qualificationType = qualification.getQualificationType();
            this.grade = qualification.getGrade();
            return this;
        }

        public AcademicQualification build() {
            return new AcademicQualification(this);
        }
    }

    public String getId() {
        return id;
    }

    public QualificationType getQualificationType() {
        return qualificationType;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getGrade() {
        return grade;
    }
}
