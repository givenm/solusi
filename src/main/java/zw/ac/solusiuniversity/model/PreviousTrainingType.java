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
public class PreviousTrainingType implements Serializable, Comparable<PreviousTrainingType> {

    @Id
    private String id;
    private String trainingName;
    private Date startDate;
    private Date endDate;
    private boolean studyStatus;

    private PreviousTrainingType() {
    }

    private PreviousTrainingType(Builder builder) {
        this.id = builder.id;
        this.trainingName = builder.trainingName;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.studyStatus = builder.studyStatus;
    }

    @Override
    public int compareTo(PreviousTrainingType o) {
        return startDate.compareTo(o.startDate);
    }

    public static class Builder {

        private String id;
        private String trainingName;
        private final Date startDate;
        private Date endDate;
        private boolean studyStatus;

        public Builder(Date value) {
            this.startDate = value;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }
        
        public Builder trainingName(String trainingName) {
            this.trainingName = trainingName;
            return this;
        }

        public Builder endDate(Date endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder studyStatus(boolean studyStatus) {
            this.studyStatus = studyStatus;
            return this;
        }

        public Builder previousTrainingType(PreviousTrainingType previousTrainingType) {
            this.id = previousTrainingType.getId();
            this.endDate = previousTrainingType.getEndDate();
            this.studyStatus = previousTrainingType.isStudyStatus();
            return this;
        }

        public PreviousTrainingType build() {
            return new PreviousTrainingType(this);
        }
    }

    public String getId() {
        return id;
    }
    
    public String trainingName() {
        return trainingName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public boolean isStudyStatus() {
        return studyStatus;
    }
}
