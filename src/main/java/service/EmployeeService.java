package service;

import domain.Employee;
import domain.PersonComparator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PetSoft
 * @date 24.03.2024 12:37
 */
public class EmployeeService implements iPersonService<Employee> {
    private int count;
    private List<Employee> employees;

    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    @Override
    public List<Employee> getAll() {
        return this.employees;
    }

    @Override
    public void create(String name, int age) {
        Employee employee = new Employee(name, age, "basic");
        employees.add(employee);
        count++;
    }

    public void sortByFIO() {
        PersonComparator<Employee> persComp = new PersonComparator<>();
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
