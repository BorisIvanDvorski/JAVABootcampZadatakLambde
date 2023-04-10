public class Student {
    Student(int id, String name, int age, double gpa){
        setId(id);
        setName(name);
        setAge(age);
        setGpa(gpa);
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getGpa() {
        return gpa;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private int id;
    private String name;
    private int age;
    private double gpa;
}
