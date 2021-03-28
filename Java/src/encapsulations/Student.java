package encapsulations;

public class Student
{
    private int age;
    private String name;
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(final int age) {
        if (age > 20) {
            System.out.println("You are too old to be a student");
        }
        else {
            this.age = age;
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
}