package Builder;

public class Student {
    private int id;
    private String name;
    private String UniversityName;
    public int gradYear;
    public int psp;
    public int age;
    private String phoneNumber;

    public Student(int id, String name, String universityName, int gradYear, int psp, int age, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.UniversityName = universityName;
        this.gradYear= gradYear;
        this.psp = psp;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", UniversityName='" + UniversityName + '\'' +
                ", gradYear=" + gradYear +
                ", psp=" + psp +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static class Builder{ // task --> Take inputs, validate inputs, and create student object
        private int id;
        private String name;
        private String UniversityName;
        public int gradYear;
        public int psp;
        public int age;
        private String phoneNumber;

        public Builder id(int id){
            this.id = id;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder psp(int psp){
            this.psp = psp;
            return this;
        }
        public Builder UniversityName(String UniversityName){
            this.UniversityName = UniversityName;
            return this;
        }
        public Builder gradYear(int gradYear){
            this.gradYear = gradYear;
            return this;
        }
        public Builder PhoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        private void validate(){
            if(this.gradYear > 2023){
             throw new GradYearInvalidException();
            }
            if(this.name ==null){
                throw new InvalidNameException();
            }
            if(age < 18){
                throw new InvalidAgeException();
            }
        }
        public Student build(){
            validate();
            return new Student(this.id, this.name, this.UniversityName, this.gradYear, this.psp, this.age, this.phoneNumber);

        }
    }

}
