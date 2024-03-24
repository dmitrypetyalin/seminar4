package domain;

import java.util.Comparator;

/**
 * @author PetSoft
 * @date 24.03.2024 12:33
 */
public class PersonComparator<T extends Person<String, Integer>> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
