package JavaCollectionFramework.HashMapHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1= new Student("Nam",20,"HN");
        Student student2= new Student("Tuan",22,"HN");
        Student student3= new Student("Anh",21,"HN");
        Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        for (Map.Entry<Integer,Student> studentEntry : studentMap.entrySet()){
            System.out.println(studentEntry.toString());
        }
        System.out.println("----------set");
        Set<Student> studentSet= new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student1);
        for (Student student: studentSet) {
            System.out.println(student.toString());
            
        }
    }
}
