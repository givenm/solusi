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
public class QualificationType implements Serializable, Comparable<QualificationType> {

    @Id
    private String id;
    private String qualificationName;

    private QualificationType() {
    }

    private QualificationType(Builder builder) {
        this.id = builder.id;
        this.qualificationName = builder.qualificationName;
    }

    @Override
    public int compareTo(QualificationType o) {
        return qualificationName.compareTo(o.qualificationName);
    }

    public static class Builder {

        private String id;
        private final String qualificationName;

        public Builder(String value) {
            this.qualificationName = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder qualificationType(QualificationType qualificationType) {
            this.id = qualificationType.getId();
            return this;
        }

        public QualificationType build() {
            return new QualificationType(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getQualificationName() {
        return qualificationName;
    }
}
