package controller;

import domain.Person;
import domain.Teacher;
import domain.Worker;

import java.util.List;

/**
 * @author PetSoft
 * @date 24.03.2024 12:12
 */
public class AccountController {
    public static <V extends Person<String, Integer>> void print(List<V> group) {
        for (V s : group) {
            System.out.println(s);
        }
    }

    public static <T extends Worker<String, Integer>> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }

    //Загатовка для метода averageAge
    public static <T extends Person<String, Integer>> double averageAge(List<T> persons) {
        double avgAge = 0;
        int size = persons.size();
        for (T person : persons) {
            avgAge += (int) person.getAge();
        }
        return avgAge / size;
    }
}
