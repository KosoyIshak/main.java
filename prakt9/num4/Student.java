package prakt9.num4;
public class Student implements Comparable<Student> {
    private String name;
    private double GPA;
    public Student(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }
    public String getName() {
        return name;
    }
    public double getGPA() {
        return GPA;
    }
    @Override
    public String toString() {
        return name + " " + GPA;
    }
    @Override
    public int compareTo(Student studentArg) {
        return Double.compare(studentArg.getGPA(), this.GPA);
    }
}