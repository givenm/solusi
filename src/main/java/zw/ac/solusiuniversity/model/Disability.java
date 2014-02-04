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
public class Disability implements Serializable, Comparable<Disability> {

    @Id
    private String id;
    private String additionalSupportNeeds;
    private String contactNumberOfEmergency;
    private String contactAddressOfEmergency;

    private Disability() {
    }

    private Disability(Builder builder) {
        this.id = builder.id;
        this.additionalSupportNeeds = builder.additionalSupportNeeds;
        this.contactNumberOfEmergency = builder.contactNumberOfEmergency;
        this.contactAddressOfEmergency = builder.contactAddressOfEmergency;
    }

    @Override
    public int compareTo(Disability o) {
        return contactNumberOfEmergency.compareToIgnoreCase(o.contactNumberOfEmergency);
    }

    public static class Builder {

        private String id;
        private String additionalSupportNeeds;
        private final String contactNumberOfEmergency;
        private String contactAddressOfEmergency;

        public Builder(String value) {
            this.contactNumberOfEmergency = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder additionalSupportNeeds(String value) {
            this.additionalSupportNeeds = value;
            return this;
        }

        public Builder contactAddressOfEmergency(String value) {
            this.contactAddressOfEmergency = value;
            return this;
        }

        public Builder disability(Disability disability) {
            this.id = disability.getId();
            this.additionalSupportNeeds = disability.getAdditionalSupportNeeds();
            this.contactAddressOfEmergency = disability.getContactAddressOfEmergency();
            return this;
        }

        public Disability build() {
            return new Disability(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getAdditionalSupportNeeds() {
        return additionalSupportNeeds;
    }

    public String getContactNumberOfEmergency() {
        return contactNumberOfEmergency;
    }

    public String getContactAddressOfEmergency() {
        return contactAddressOfEmergency;
    }
}
