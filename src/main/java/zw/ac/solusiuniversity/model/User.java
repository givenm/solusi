/*
 * To change this template, choose Tools | Templates
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
public class User implements Serializable, Comparable<User> {

    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    @DBRef
    private Role role;

    private User() {
    }

    private User(Builder builder) {
        this.id = builder.id;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.username = builder.username;
        this.password = builder.password;
        this.role = builder.role;
    }

    @Override
    public int compareTo(User o) {
        return firstname.compareTo(o.firstname);
    }

    public static class Builder {

        private String id;
        private final String firstname;
        private String lastname;
        private String username;
        private String password;
        private Role role;

        public Builder(String firstname) {
            this.firstname = firstname;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder lastname(String value) {
            this.lastname = value;
            return this;
        }

        public Builder username(String value) {
            this.username = value;
            return this;
        }

        public Builder password(String value) {
            this.password = value;
            return this;
        }

        public Builder role(Role value) {
            this.role = value;
            return this;
        }

        public Builder user(User user) {
            this.id = user.getId();
            this.lastname = user.getLastname();
            this.username = user.getUsername();
            this.password = user.getPassword();
            this.role = user.getRole();
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }
}
