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
public class Children implements Serializable, Comparable<Children> {

    @Id
    private String id;
    private String name;
    private String sex;
    private int age;
    private String levelType;
    private String level;
    private Date dob;
    private String placeOfBirth;

    private Children() {
    }

    private Children(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.sex = builder.sex;
        this.age = builder.age;
        this.levelType = builder.levelType;
        this.level = builder.level;
        this.dob = builder.dob;
        this.placeOfBirth = builder.placeOfBirth;
    }

    @Override
    public int compareTo(Children o) {
        return name.compareToIgnoreCase(o.name);
    }

    public static class Builder {

        private String id;
        private final String name;
        private String sex;
        private int age;
        private String levelType;
        private String level;
        private Date dob;
        private String placeOfBirth;

        public Builder(String value) {
            this.name = value;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder sex(String value) {
            this.sex = value;
            return this;
        }

        public Builder age(int value) {
            this.age = value;
            return this;
        }

        public Builder levelType(String value) {
            this.levelType = value;
            return this;
        }

        public Builder level(String value) {
            this.level = value;
            return this;
        }

        public Builder dob(Date value) {
            this.dob = value;
            return this;
        }

        public Builder placeOfBirth(String value) {
            this.placeOfBirth = value;
            return this;
        }

        public Builder children(Children children) {
            this.id = children.getId();
            this.sex = children.getSex();
            this.age = children.getAge();
            this.levelType = children.getLevelType();
            this.level = children.getLevel();
            this.dob = children.getDob();
            this.placeOfBirth = children.getPlaceOfBirth();
            return this;
        }

        public Children build() {
            return new Children(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getLevelType() {
        return levelType;
    }

    public String getLevel() {
        return level;
    }

    public Date getDob() {
        return dob;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }
}
