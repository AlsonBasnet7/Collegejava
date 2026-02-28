
public class student{

public class StudentTester{
    //attributes
    public String name;
    public int age;
    public int id;
    public double totalGrade;

    public StudentTester(String name, int age, int id, double totalGrade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.totalGrade = totalGrade;
    }
    public StudentTester(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.totalGrade = 0.0;
    }
    public void displayInfo(){
        System.out.println("The name of the student is"+name);
        System.out.println("The age of the student is"+age);
        System.out.println("The id of the student is "+id);
        System.out.println("THe total grade of the student is"+totalGrade);

    }
    public boolean isAdult(){
        return age>=18;

    }
    public void updateGrade(double grade){
        totalGrade += grade;
    }
    @Override
    public String toString(){
        return "Name of the student"+name+"Age of the studnet is "+age+"ID of the student is"+id+"total grade of the student is"+totalGrade;
    }   
}
}

        

