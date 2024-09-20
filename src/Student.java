
 public class Student {
    String name;
     int age;
     String standard;

    public Student(String name, int age,String standard) {
        this.name = name;
        this.age = age;
        this.standard= standard;
    }

}

class Details {
    public static void main(String[] args) {
        // Creating a sample student
        Student s= new Student("prasad", 24 ,"b tech");
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);

    }
}