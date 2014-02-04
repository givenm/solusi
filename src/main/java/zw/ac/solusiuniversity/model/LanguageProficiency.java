/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.model;

import java.io.Serializable;
import java.util.Date;
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
public class LanguageProficiency implements Serializable, Comparable<LanguageProficiency> {

    @Id
    private String id;
    private boolean english;
    private boolean previousEducationInEnglish;
    private String previousEducationLanguage;
    private String firstSpockenLanguage;
    private boolean attendedBefore;
    @DBRef
    private Set<PreviousTrainingType> previousTrainingTypes;

    private LanguageProficiency() {
    }

    private LanguageProficiency(Builder builder) {
        this.id = builder.id;
        this.english = builder.english;
        this.previousEducationInEnglish = builder.previousEducationInEnglish;
        this.previousEducationLanguage = builder.previousEducationLanguage;
        this.firstSpockenLanguage = builder.firstSpockenLanguage;
        this.attendedBefore = builder.attendedBefore;
        this.previousTrainingTypes = builder.previousTrainingTypes;
    }

    @Override
    public int compareTo(LanguageProficiency o) {
        return firstSpockenLanguage.compareToIgnoreCase(o.firstSpockenLanguage);
    }

    public static class Builder {

        private String id;
        private boolean english;
        private boolean previousEducationInEnglish;
        private String previousEducationLanguage;
        private final String firstSpockenLanguage;
        private boolean attendedBefore;
        private Set<PreviousTrainingType> previousTrainingTypes;

        public Builder(String value) {
            this.firstSpockenLanguage = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder english(boolean value) {
            this.english = value;
            return this;
        }

        public Builder previousEducationInEnglish(boolean value) {
            this.previousEducationInEnglish = value;
            return this;
        }

        public Builder previousEducationLanguage(String value) {
            this.previousEducationLanguage = value;
            return this;
        }

        public Builder attendedBefore(boolean value) {
            this.attendedBefore = value;
            return this;
        }

        public Builder previousTrainingTypes(Set<PreviousTrainingType> value) {
            this.previousTrainingTypes = value;
            return this;
        }

        public Builder languageProficiency(LanguageProficiency languageProficiency) {
            this.id = languageProficiency.getId();
            this.english = languageProficiency.isEnglish();
            this.previousEducationInEnglish = languageProficiency.isPreviousEducationInEnglish();
            this.previousEducationLanguage = languageProficiency.getPreviousEducationLanguage();
            this.attendedBefore = languageProficiency.isAttendedBefore();
            this.previousTrainingTypes = languageProficiency.getPreviousTrainingTypes();

            return this;
        }

        public LanguageProficiency build() {
            return new LanguageProficiency(this);
        }
    }

    public String getId() {
        return id;
    }

    public boolean isEnglish() {
        return english;
    }

    public boolean isPreviousEducationInEnglish() {
        return previousEducationInEnglish;
    }

    public String getPreviousEducationLanguage() {
        return previousEducationLanguage;
    }

    public String getFirstSpockenLanguage() {
        return firstSpockenLanguage;
    }

    public boolean isAttendedBefore() {
        return attendedBefore;
    }

    public Set<PreviousTrainingType> getPreviousTrainingTypes() {
        return previousTrainingTypes;
    }
}
