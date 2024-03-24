package domain;

import java.util.Iterator;
import java.util.List;

/**
 * @author PetSoft
 * @date 24.03.2024 12:35
 */
public class StudentIterator implements Iterator<Student> {
    private int counter;
    private final List<Student> students;

    public StudentIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter<students.size();
    }
    @Override
    public Student next() {
        if(!hasNext())
        {
            return null;
        }
        //counter++;
        return students.get(counter++);
    }
}
