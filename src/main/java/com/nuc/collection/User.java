package com.nuc.collection;

import java.util.Objects;

public class User implements Comparable{
    private String name;
    private String sex;

    public User(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals!!!!!!");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(sex, user.sex);
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode!!!!!!");
        return Objects.hash(name, sex);
    }

    @Override
    public int compareTo(Object o) {
        User user =(User)o;
        return name.compareTo(user.name);
    }
}
