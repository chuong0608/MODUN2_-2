package JavaCollectionFramework.ComparableComparator;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private  String address;

    public Student() {
    }

    public Student(String name, int age, String adrress) {
        this.name = name;
        this.age = age;
        this.address = adrress;
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

    public String getAdrress() {
        return address;
    }

    public void setAdrress(String adrress) {
        this.address = adrress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.getName().compareTo(student.getName());
    }
}
