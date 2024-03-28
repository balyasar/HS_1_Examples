package com.yasar.lesson14.setOrnek;

import javax.naming.ldap.HasControls;
import java.util.Objects;

public class Kullanici {
    private int id;
    private String userName;

    public Kullanici(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Kullanici{");
        sb.append("id=").append(id);
        sb.append(", userName='").append(userName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kullanici kullanici = (Kullanici) o;
        return id == kullanici.id && Objects.equals(userName, kullanici.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName);
    }
}
