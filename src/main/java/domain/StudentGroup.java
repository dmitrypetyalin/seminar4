package domain;

import java.util.Iterator;
import java.util.List;

/**
 * @author PetSoft
 * @date 24.03.2024 12:34
 */
public class StudentGroup implements Iterable<Student<String, Integer>> {
    private List<Student<String, Integer>> group;
    private Integer idGroup;

    public StudentGroup(List<Student<String, Integer>> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Student<String, Integer>> getGroup() {
        return group;
    }

    public void setGroup(List<Student<String, Integer>> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }

    @Override
    public Iterator<Student<String, Integer>> iterator() {
        return new StudentIterator(group);
    }
}
