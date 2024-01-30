package Prototype;

public class Main {
    public static void main(String[] args) {
        student studentPrototype = new student("2023", "BatchA", "LLD", "Sandeep", "12-Dec-23", "TTS", "30-Apr-2024");
        System.out.println("Student proto");
        System.out.println(studentPrototype);

        System.out.println("copy student");
        student studentcopy = studentPrototype.clone();
        studentcopy.setName("Ram");
        studentcopy.setEmail("rdgupta1336@gmail.com");
        studentcopy.setPhoneNumber("1526626277");
        System.out.println(studentcopy);
    }
}
