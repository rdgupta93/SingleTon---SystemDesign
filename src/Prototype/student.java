package Prototype;

public class student implements prototype<student> {
    private String name;
    private String email;
    private String phoneNumber;
    private String yearOfEnrollment;
    private String batchName;
    private String moduleName;
    private String instructorName;
    private String moduleStatDate;
    private String moduleEndDate;
    private  String moduleSchedule;

    public student(String yearOfEnrollment, String batchName, String moduleName, String instructorName, String moduleStatDate, String moduleEndDate, String moduleSchedule) {
        this.yearOfEnrollment = yearOfEnrollment;
        this.batchName = batchName;
        this.moduleName = moduleName;
        this.instructorName = instructorName;
        this.moduleStatDate = moduleStatDate;
        this.moduleEndDate = moduleEndDate;
        this.moduleSchedule = moduleSchedule;
    }

    public student(student student) {// working as a copy constructor and can be used to create deep copies for fixed attributes

        this.yearOfEnrollment = student.yearOfEnrollment;
        this.batchName = student.batchName;
        this.moduleName = student.moduleName;
        this.instructorName = student.instructorName;
        this.moduleStatDate = student.moduleStatDate;
        this.moduleEndDate = student.moduleEndDate;
        this.moduleSchedule = student.moduleSchedule;
    }

    public student clone(){
        return new student(this);
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", yearOfEnrollment='" + yearOfEnrollment + '\'' +
                ", batchName='" + batchName + '\'' +
                ", moduleName='" + moduleName + '\'' +
                ", instructorName='" + instructorName + '\'' +
                ", moduleStatDate='" + moduleStatDate + '\'' +
                ", moduleEndDate='" + moduleEndDate + '\'' +
                ", moduleSchedule='" + moduleSchedule + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setYearOfEnrollment(String yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setModuleStatDate(String moduleStatDate) {
        this.moduleStatDate = moduleStatDate;
    }

    public void setModuleEndDate(String moduleEndDate) {
        this.moduleEndDate = moduleEndDate;
    }

    public void setModuleSchedule(String moduleSchedule) {
        this.moduleSchedule = moduleSchedule;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public String getBatchName() {
        return batchName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public String getModuleStatDate() {
        return moduleStatDate;
    }

    public String getModuleEndDate() {
        return moduleEndDate;
    }

    public String getModuleSchedule() {
        return moduleSchedule;
    }
}
