package service;

import domain.PersonComparator;
import domain.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PetSoft
 * @date 24.03.2024 20:55
 */
public class TeacherService implements iPersonService<Teacher<String, Integer>> {
    private int count;
    private List<Teacher<String, Integer>> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher<String, Integer>> getAll() {
        return this.teachers;
    }

    @Override
    public void create(String name, int age) {
        Teacher<String, Integer> teacher = new Teacher<>(name, age, "docent");
        teachers.add(teacher);
        count++;
    }

    public void sortByFIO() {
        PersonComparator<Teacher<String, Integer>> persComp = new PersonComparator<>();
        teachers.sort(persComp);
    }
}
