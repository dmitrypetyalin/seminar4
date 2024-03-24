package service;

import java.util.List;

/**
 * @author PetSoft
 * @date 24.03.2024 12:38
 */
public interface iPersonService<T> {
    List<T> getAll();

    void create(String name, int age);
    // void print(List<T> group);
}
