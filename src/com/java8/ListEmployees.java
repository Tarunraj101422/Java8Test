package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListEmployees {
    public static void main(String[] args){

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(123,"Tarun",200000));
        list.add(new Employee(456,"Raj",300000));
        list.add(new Employee(789,"Ram",400000));

        Optional<Employee> maxSal = list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(maxSal);

        //List<Employee> MaxSal = descOrder(list).forEach(employee -> (System.out.println(employee.getSalary());));


    }
    private static List<Employee> descOrder(List<Employee> employees){
        List<Employee> employees1 = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());
        return employees1;
    }
}
