package domain;

/**
 * @author PetSoft
 * @date 24.03.2024 22:02
 */
public class Worker<V extends String, N extends Number> extends Person<V, N> {
    public Worker(V name, N age) {
        super(name, age);
    }
}
