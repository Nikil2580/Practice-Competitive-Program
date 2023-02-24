package Day3;

public class Main {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Chechi";
        s1.roll = 10;
        s1.gender = "Female";

        student s2 = new student();
        s2.name = "Nikil";
        s2.roll = 20;
        s2.gender = "Male";

        System.out.println(s1.gender);
        System.out.println(s2.name);
    }
}
