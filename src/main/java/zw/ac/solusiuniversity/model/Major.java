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
public class Major implements Serializable, Comparable<Major> {

    @Id
    private String id;
    private Course course;
    private String preference;

    private Major() {
    }

    private Major(Builder builder) {
        this.id = builder.id;
        this.course = builder.course;
        this.preference = builder.preference;
    }

    @Override
    public int compareTo(Major o) {
        return preference.compareToIgnoreCase(o.preference);
    }

    public static class Builder {

        private String id;
        private Course course;
        private final String preference;

        public Builder(String value) {
            this.preference = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder course(Course value) {
            this.course = value;
            return this;
        }

        public Builder major(Major major) {
            this.id = major.getId();
            this.course = major.getCourse();
            return this;
        }

        public Major build() {
            return new Major(this);
        }
    }

    public String getId() {
        return id;
    }

    public Course getCourse() {
        return course;
    }

    public String getPreference() {
        return preference;
    }
}
