package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Jane", "Jones", 123));
        list.add(new Employee("John", "Doe", 4567));
        list.add(new Employee("Marry", "Smith", 22));
        list.add(new Employee("Mike", "Wilson", 3245));

        /*list.forEach(employee -> System.out.println(employee));

        System.out.println(list.get(1));

        System.out.println(list.isEmpty());*/

        list.set(1, new Employee("John", "Adams", 4568));

        //System.out.println(list.size());

        list.add(3, new Employee("John", "Doe", 4567));

        //list.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = list.toArray(new Employee[list.size()]);

        for ( Employee emp : employeeArray) {
            System.out.println(emp);
        }

        System.out.println(list.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(list.indexOf(new Employee("John", "Doe", 4567)));

    }
}
