package it.unibo.composition;

public class Testing {

    public static void main(final String[] args) {

        User alex = new Student(145326, "Alex", "Rossi", "hklnoih562/", 2023);
        User marco = new Student(894712, "Marco", "Bianchi", "ojfoae69*", 2019);
        User jessica = new Student(125369, "Jessica", "Bracchini", "awewprkxf63%", 2022);

        // 2)Creare 2 docenti a piacere
        User profA = new Professor(892536, "Antonio", "Degli Angeli", "ksoemfo59");

        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti

        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con
        // nMaxStudents=2

        // 5) Iscrivere tutti e 3 gli studenti agli esami

        // 6) Stampare in stdout la rapresentazione in stringa dei due esami
    }
}
