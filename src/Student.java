
public class Student {

    private String name;
    private int grade;

    // Constructor
    public Student (String name, int grade){
        this.name = name;
        this.grade = grade;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isPassed() {
        return grade >= 13;  
    }
}
