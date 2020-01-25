package org.wing;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("wing", 55));
        employees.add(new Employee("alex", 38));
        System.out.println(employees);

        ArrayList<Employee> newEmployees = new ArrayList<>();
        newEmployees.add(new Employee("aida", 55));
        newEmployees.add(new Employee("alex", 11));
        System.out.println(employees);

        System.out.println(mergeLists(employees,newEmployees));

    }


    public static List<Employee> mergeLists(ArrayList<Employee> old, ArrayList<Employee> newList) {
        ArrayList<Employee> result = new ArrayList<>();

        for (int i = 0; i < newList.size(); i++) {
            if (!newList.get(i).areYouInThisList(old))
                result.add(newList.get(i));
        }
        for (int i = 0; i < old.size(); i++) {
            result.add(old.get(i));
        }

        return result;
    }


}
