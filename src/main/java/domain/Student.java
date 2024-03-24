package domain;

/**
 * @author PetSoft
 * @date 24.03.2024 12:32
 */
public class Student<V extends String, N extends Number> extends Person<V, N> implements Comparable<Student<V, N>> {
    private int id;
    private static int generalId;

    public Student(V name, N age) {
        super(name, age);
        this.id = generalId;
        generalId++;
    }


    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Students [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
    }

    @Override
    public int compareTo(Student o) {

        System.out.println(super.getName() + " - " + o.getName());
        if ((int) super.getAge() == (int) o.getAge()) {
            return Integer.compare(id, o.id);
            //return 0;
        }

        if ((int) super.getAge() > (int) o.getAge())
            return 1;
        else
            return -1;
    }
}
