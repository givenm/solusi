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
public class Course implements Serializable, Comparable<Course> {

    @Id
    private String id;
    private String name;

    private Course() {
    }

    private Course(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    @Override
    public int compareTo(Course o) {
        return name.compareToIgnoreCase(o.name);
    }

    public static class Builder {

        private String id;
        private final String name;

        public Builder(String value) {
            this.name = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder course(Course course) {
            this.id = course.getId();
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
