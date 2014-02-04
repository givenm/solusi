/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.ac.solusiuniversity.model;

import java.io.Serializable;
import java.util.Set;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author given
 */
@Document
public class BachelorExisting implements Serializable, Comparable<BachelorExisting> {

    @Id
    private String id;
    private String name;
    private Set<Course> courses;

    private BachelorExisting() {
    }

    private BachelorExisting(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.courses = builder.courses;
    }

    @Override
    public int compareTo(BachelorExisting o) {
        return name.compareToIgnoreCase(o.name);
    }

    public static class Builder {

        private String id;
        private final String name;
        private Set<Course> courses;

        public Builder(String value) {
            this.name = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder courses(Set<Course> value) {
            this.courses = value;
            return this;
        }

        public Builder bachelorExisting(BachelorExisting bachelorExisting) {
            this.id = bachelorExisting.getId();
            this.courses = bachelorExisting.getCourses();
            return this;
        }

        public BachelorExisting build() {
            return new BachelorExisting(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Course> getCourses() {
        return courses;
    }
}
