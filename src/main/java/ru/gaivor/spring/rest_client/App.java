package ru.gaivor.spring.rest_client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gaivor.spring.rest_client.configuration.MyConfig;
import ru.gaivor.spring.rest_client.entity.Employee;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication",Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empById = communication.getEmployee(9);
//        System.out.println(empById);

//        Employee employee = new Employee("Sveta", "Sokolova", "HR", 1330);
//        employee.setId(10);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(10);

    }
}
