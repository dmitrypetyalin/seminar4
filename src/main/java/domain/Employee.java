package domain;

/**
 * @author PetSoft
 * @date 24.03.2024 12:31
 */
public class Employee<V extends String, N extends Number> extends Worker<V, N> {
    private String special;

    public Employee(V firstName, N age, String special) {
        super(firstName, age);
        this.special = special;
    }
}
