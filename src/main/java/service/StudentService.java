package service;

import domain.PersonComparator;
import domain.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PetSoft
 * @date 24.03.2024 12:38
 */
public class StudentService implements iPersonService<Student<String, Integer>> {
    private int count;
    private List<Student<String, Integer>> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student<String, Integer>> getAll() {
        return this.students;
    }

    @Override
    public void create(String name, int age) {
        Student<String, Integer> stud = new Student<>(name, age);
        students.add(stud);
        count++;
    }

    public void sortByFIO() {
        PersonComparator<Student<String, Integer>> persComp = new PersonComparator<>();
        students.sort(persComp);
    }

    // @Override
    // public void print(List<Student> group) {
    //     for(Student s : group)
    //     {
    //         System.out.println(s);
    //     }
    // }
}
