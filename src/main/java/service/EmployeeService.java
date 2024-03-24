package service;

import domain.Employee;
import domain.PersonComparator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PetSoft
 * @date 24.03.2024 12:37
 */
public class EmployeeService implements iPersonService<Employee<String, Integer>> {
    private int count;
    private List<Employee<String, Integer>> employees;

    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    @Override
    public List<Employee<String, Integer>> getAll() {
        return this.employees;
    }

    @Override
    public void create(String name, int age) {
        Employee<String, Integer> employee = new Employee<>(name, age, "basic");
        employees.add(employee);
        count++;
    }

    public void sortByFIO() {
        PersonComparator<Employee<String, Integer>> persComp = new PersonComparator<>();
        employees.sort(persComp);
    }

    // @Override
    // public void print(List<Employee> group) {
    //     for(Employee s : group)
    //     {
    //         System.out.println(s);
    //     }
    // }
}
