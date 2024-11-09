package it.unibo.composition;

public class Testing {

    public static void main(final String[] args) {

        Student alex = new Student(145326, "Alex", "Rossi", "hklnoih562/", 2023);
        Student marco = new Student(894712, "Marco", "Bianchi", "ojfoae69*", 2019);
        Student jessica = new Student(125369, "Jessica", "Bracchini", "awewprkxf63%", 2022);

        Professor profA = new Professor(892536, "Antonio", "Degli Angeli", "ksoemfo59");
        Professor profB = new Professor(112698, "Cristina", "Manenti", "jeojdth89");

        ExamRoom lab1 = new ExamRoom(100, null, true, true);
        ExamRoom lab2 = new ExamRoom(80, null, false, false);

        Exam algorithms = new Exam(789, 10, "Algoritmi e Strutture dati", profA, lab2);
        Exam databases = new Exam(456, 2, "Basi di Dati", profB, lab1);

        algorithms.registerStudent(jessica);
        databases.registerStudent(marco);
        databases.registerStudent(alex);

        System.out.println(algorithms);
        System.out.println(databases);
    }
}
