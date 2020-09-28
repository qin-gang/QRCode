package com.nuc.collection;

import java.util.Objects;

public class Student extends User {
    private String sno;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public Student(String name, String sex, String sno) {
        super(name, sex);
        this.sno = sno;
    }

    public Student(String sno) {
        this.sno = sno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return sno.equals(student.sno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sno);
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                '}';
    }
}
