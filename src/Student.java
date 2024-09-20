
 public class Student {
    String name;
     int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

class Details {
    public static void main(String[] args) {
        // Creating a sample student
        Student s= new Student("prasad", 24 );
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);

    }
}