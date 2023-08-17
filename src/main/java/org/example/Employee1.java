package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vinayagamoorthy Ezhumalai <n520492> on 17/02/2023
 */
public class Employee1 {
    public static void main(String[] args) {
        Employee employee = new Employee("vinay", 30, "male", "tcs");
        Employee employee1 = new Employee("Moorthy", 25, "male", "infosys");
        Employee employee2 = new Employee("kumar", 22, "male", "ZOHO");
        Employee employee3 = new Employee("chella", 40, "male", "IBM");

        List<Employee> li = new ArrayList<>();
        List<Employee> li1 = new ArrayList<>();
        li.add(employee);
        li.add(employee2);
        li.add(employee1);
        li.add(employee3);

        List<Employee> collect = li.stream().filter(x -> x.getAge() > 25).collect(Collectors.toList());
        System.out.println(collect);
//        for (Employee emp : li) {
//            if (emp.getAge() > 25 && emp.getGender() == "male") {
//                li1.add(emp);
//            }
//        }
//        for (Employee obj : li) {
//            System.out.println(obj);
//        }
        //System.out.println(li1.toString());
    }

}

