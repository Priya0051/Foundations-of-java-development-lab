public class Student {
    String name;
    int age;
    static int count = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    void display() {
        String studentName = name;
        int studentAge = age;

        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
    }

    public static void main(String[] args) {
        String name1 = "Riya";
        int age1 = 20;

        String name2 = "Anjali";
        int age2 = 21;

        Student s1 = new Student(name1, age1);
        Student s2 = new Student(name2, age2);

        s1.display();
        s2.display();

        System.out.println("Total Students: " + count);
    }
}
