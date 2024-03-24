package service;

import domain.PersonComparator;
import domain.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PetSoft
 * @date 24.03.2024 12:38
 */
public class StudentService implements iPersonService<Student> {
    private int count;
    private List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String name, int age) {
        Student stud = new Student(name, age);
        count++;
        students.add(stud);
    }

    public void sortByFIO()
    {
        PersonComparator<Student> persComp = new PersonComparator<Student>();
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
