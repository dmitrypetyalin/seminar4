package controller;

import domain.Person;
import domain.Worker;

import java.util.List;

/**
 * @author PetSoft
 * @date 24.03.2024 12:12
 */
public class AccountController {
    public static <V extends Person> void print(List<V> group) {
        for (V s : group) {
            System.out.println(s);
        }
    }

    public static <T extends Worker> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }

    //Загатовка для метода averageAge
    public static <T extends Person> double averageAge(List<T> persons) {
        double avgAge = 0;
        int size = persons.size();
        for (T person : persons) {
            avgAge += person.getAge();
        }
        return avgAge / size;
    }
}
