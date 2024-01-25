package Builder;

public class Main {
    public static void main(String[] args) {
      //Student s = Student.builder();
        Student s = Student.builder()
                .id(1)
                .name("Ram")
                .age(19)
                .PhoneNumber("2673728280")
                .UniversityName("Mumbai University")
                .psp(90)
                .gradYear(2020)
                .build();

        System.out.println(s);



    }
}
