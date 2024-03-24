package domain;

/**
 * @author PetSoft
 * @date 24.03.2024 12:32
 */
public class Teacher<V extends String, N extends Number> extends Worker<V, N> {
    private String acadDegree;

    public Teacher(V firstName, N age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }

    public String getAcadDegree() {
        return this.acadDegree;
    }
}
