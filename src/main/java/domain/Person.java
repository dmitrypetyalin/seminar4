package domain;

/**
 * @author PetSoft
 * @date 24.03.2024 12:30
 */
public abstract class Person<V extends String, N extends Number> {
    private V name;
    private N age;

    public Person(V name, N age) {
        this.name = name;
        this.age = age;
    }

    public V getName() {
        return name;
    }

    public void setName(V name) {
        this.name = name;
    }

    public N getAge() {
        return age;
    }

    public void setAge(N age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
