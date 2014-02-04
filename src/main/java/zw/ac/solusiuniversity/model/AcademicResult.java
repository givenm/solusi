/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.model;

import java.io.Serializable;
import java.util.Set;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author given
 */
//Clarity
@Document
public class AcademicResult implements Serializable {

    @Id
    private String id;
    @DBRef
    private Set<AcademicQualification> academicQualifications;

    private AcademicResult() {
    }

    private AcademicResult(Builder builder) {
        this.id = builder.id;
        this.academicQualifications = builder.academicQualifications;
    }

//    @Override
//    public int compareTo(AcademicResult o) {
//        return academicQualifications.(o.academicQualifications);
//    }

    public static class Builder {

        private String id;
        private final Set<AcademicQualification> academicQualifications;

        public Builder(Set<AcademicQualification> value) {
            this.academicQualifications = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder academicResult(AcademicResult academicResult) {
            this.id = academicResult.getId();
            return this;
        }

        public AcademicResult build() {
            return new AcademicResult(this);
        }
    }

    public String getId() {
        return id;
    }

    public Set<AcademicQualification> getAcademicQualifications() {
        return academicQualifications;
    }
}
