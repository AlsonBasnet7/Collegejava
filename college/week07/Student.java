class StudentInfo {
    public String name;
    public int studentId;
    public int age;
    public String course;

    public StudentInfo(String name, int studentId, int age, String course) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.course = course;
    }

    
    public String toString() {
        return "Name: " + this.name +
               "\nStudent ID: " + this.studentId +
               "\nAge: " + this.age +
               "\nCourse: " + this.course;
    }
}

public class Student {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo("Alson", 69696, 69, "BIT");

        System.out.println(s1);
    }
}
