package it.unibo.composition;

import java.util.Arrays;

public class Professor implements User {

    private static final String DOT = ".";
    private final String name;
    private final String surname;
    private final int id;
    private final String password;
    private String[] courses;

    public Professor(
        final int id,
        final String name,
        final String surname,
        final String password,
        String[] courses
    ) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = courses;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getID() {
        return this.id;
    }

    public String getCourses() {
        return Arrays.toString(this.courses);
    }

    public void replaceCourse(String course, int index) {
        this.courses[index] = course;
    }

    public void replaceAllCourses(String[] courses) {
        this.courses = courses;
    }

    public String toString() {
        return "Professor ["
            + "name=" + this.name
            + ", surname=" + this.surname
            + ", id=" + this.id
            + ", courses=" + Arrays.toString(this.courses)
            + "]";
    }

    public String getUsername() {
        return this.name + Professor.DOT + this.surname;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDescription() {
        return this.toString();
    } 
}
