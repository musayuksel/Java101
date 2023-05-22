package encapsulation;

public class Student {
    private String name;
    private int age;
// private properties can only be accessed within the class
    //getter and setter methods are used to access private properties, so they are public
    // generally, all set logic is done in the setter method
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
