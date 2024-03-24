import controller.AccountController;
import domain.*;
import service.StudentService;
import service.TeacherService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author PetSoft
 * @date 24.03.2024 12:39
 */
public class App {
    public static void main(String[] args) {
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь", 23);
        Student s5 = new Student("Даша", 23);
        Student s6 = new Student("Лена", 23);

        List<Student> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group4580 = new StudentGroup(listStud, 4580);

        StudentService studServ = new StudentService();
        for (Student student : listStud) {
            studServ.create(student.getName(), student.getAge());
        }

        AccountController.print(studServ.getAll());

        studServ.sortByFIO();

        System.out.println("=========================================================");

        AccountController.print(studServ.getAll());

        Teacher t1 = new Teacher("Галина", 55, "Docent");
        Employee e1 = new Employee("Татьяна", 57, "Slesar");

        System.out.println(new PersonComparator<Student>().compare(s1, s3));

//        AccountController.paySalary(s1, 50000);
        AccountController.paySalary(t1, 50000);
        AccountController.paySalary(e1, 20000);

        System.out.println(AccountController.averageAge(listStud));

        System.out.println("=========================================================");

        List<Teacher> listOfTeachers = new ArrayList<>(Arrays.asList(new Teacher("Linda", 34, "docent"),
                new Teacher("Gram", 44, "PHD"),
                new Teacher("Donald", 48, "PHD")));

        TeacherService teacherService = new TeacherService();

        for (Teacher teacher : listOfTeachers)
            teacherService.create(teacher.getName(), teacher.getAge());

        AccountController.print(teacherService.getAll());

        teacherService.sortByFIO();

        AccountController.print(teacherService.getAll());

        System.out.println(AccountController.averageAge(listOfTeachers));
    }
}
