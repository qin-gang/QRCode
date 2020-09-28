package com.nuc.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class TestT {
    public static void main(String[] args) {
        Student student = new Student("q", "q", "qw");
        Student student1 = new Student("a", "q", "qw");
        Student student2 = new Student("z", "q", "qw");

        User user = new User("rr", "132");
        User user2 = new User("dd", "132");
        User user3 = new User("ff", "132");

        ArrayList<User> users = new ArrayList<User>();
        users.add(user2);
        users.add(user);



        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);

        aa(students);
        bb(users);
        System.out.println("=====================================");
        cc(users);
        cc(students);

        HashSet<Object> objects = new HashSet<>();

    }
    static void aa(ArrayList<? extends User> u){
        System.out.println(u);
    }

    static void bb(ArrayList<? super Student> students){
        System.out.println(students);
    }

    static <E> void cc(ArrayList<E> e){
        System.out.println(e);
    }
}
