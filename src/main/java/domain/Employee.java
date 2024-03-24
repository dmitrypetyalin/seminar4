package domain;

/**
 * @author PetSoft
 * @date 24.03.2024 12:31
 */
public class Employee extends Worker {
    private String special;

    public Employee(String firstName, int age, String special) {
        super(firstName, age);
        this.special = special;
    }
}
