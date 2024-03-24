package controller;

import domain.Person;
import domain.Teacher;

import java.util.List;

/**
 * @author PetSoft
 * @date 24.03.2024 12:12
 */
public class AccountController {
    public static <V extends Person> void print(List<V> group) {
        for(V s : group)
        {
            System.out.println(s);
        }
    }


    public static <T extends Teacher> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }

    //Загатовка для метода averageAge
    public static <T extends Person> double averageAge(List<T> persons)
    {
        return 0.0;
    }
}
