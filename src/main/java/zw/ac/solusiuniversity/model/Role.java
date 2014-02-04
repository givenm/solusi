/*
 * To change this template, choose Tools | Templates
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
public class Role implements Serializable, Comparable<Role> {

    @Id
    private String id;
    private String rolename;
    private int role;

    private Role() {
    }

    private Role(Builder builder) {
        this.id = builder.id;
        this.rolename = builder.rolename;
        this.role = builder.role;
    }

    @Override
    public int compareTo(Role o) {
        return rolename.compareTo(o.rolename);
    }

    public static class Builder {

        private String id;
        private final String rolename;
        private int role;

        public Builder(String rolename) {
            this.rolename = rolename;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder role(int value) {
            this.role = value;
            return this;
        }

        public Builder role(Role role) {
            this.id = role.getId();
            this.role = role.getRole();
            return this;
        }

        public Role build() {
            return new Role(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getRolename() {
        return rolename;
    }

    public int getRole() {
        return role;
    }
}
