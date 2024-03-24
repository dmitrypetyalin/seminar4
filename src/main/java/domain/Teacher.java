package domain;

/**
 * @author PetSoft
 * @date 24.03.2024 12:32
 */
public class Teacher extends Worker {
    private String acadDegree;

    public Teacher(String firstName, int age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }

    public String getAcadDegree() {
        return this.acadDegree;
    }
}
