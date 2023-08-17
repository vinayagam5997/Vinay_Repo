package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author Vinayagamoorthy Ezhumalai <n520492> on 25/02/2023
 */
public class EmployeeMap {
    public static void main(String[] args) {
        Employee employee = new Employee("vinay", 30, "male", "tcs");
        Employee employee1 = new Employee("Moorthy", 25, "male", "infosys");
        Employee employee2 = new Employee("kumar", 22, "male", "ZOHO");
        Employee employee3 = new Employee("chella", 40, "male", "IBM");
        Map<Integer, Employee> map = new HashMap<>();
        map.put(1, employee);
        map.put(2, employee1);
        map.put(3, employee2);
        map.put(4, employee3);
        List<Object> li = new ArrayList<>();
        Set<Map.Entry<Integer, Employee>> entries = map.entrySet();
        for (Map.Entry<Integer, Employee> obj : entries) {
            if (obj.getKey() == 2) li.add(obj);
            if (obj.getKey() == 1) li.add(obj);
        }
        System.out.println(li);
    }

}

