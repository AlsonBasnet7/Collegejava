public class zzz {
    
}
public class Student {

    // Attributes
    private String name;
    private int age;
    private int id;
    private double totalGrade;

    
    public Student(String name, int age, int id, double totalGrade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.totalGrade = totalGrade;
    }

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.totalGrade = 0.0;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        System.out.println("Total Grade: " + totalGrade);
    }

    public boolean isAdult() {
        return age >= 18;
    }

    
    public void updateGrade(double grade) {
        totalGrade += grade;
    }

    
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age +
               ", id=" + id + ", totalGrade=" + totalGrade + "}";
    }
}
