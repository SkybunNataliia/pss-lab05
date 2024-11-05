package it.unibo.composition;

public class Exam {
    
    private final int id;
    private final int maxStudents;
    private int registeredStudents;
    private final String courseName;
    private final Professor professor;
    private final ExamRoom room;
    private Student[] students;

    public Exam(
        final int id,
        final int maxStudents,
        final String courseName,
        final Professor profesor,
        final ExamRoom room
    ) {
        this.id = id;
        this.maxStudents = maxStudents;
        this.registeredStudents = 0;
        this.courseName = courseName;
        this.professor = profesor;
        this.room = room;
        this.students = new Student[maxStudents];
    }

    public int getID() {
        return this.id;
    }

    public int getMaxStudents() {
        return this.maxStudents;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void registerStudent(Student student) {
        if (this.registeredStudents < this.maxStudents) {
            this.students[registeredStudents] = student;
            this.registeredStudents += 1;
        }
    }

    public String toString() {
        return "Exam ["
            + "id=" + this.id
            + ", max students=" + this.maxStudents
            + ", registered students=" + this.registeredStudents
            + ", course name=" + this.courseName
            + ", Professor=" + this.professor
            + ", room=" + this.room
            + "]";
    }
}
