package Vector;

import java.util.List;
import java.util.Vector;

public class MyVector {

    public static void main(String[] args) {

        List<Employee> list = new Vector<>();

        list.add(new Employee("Jane", "Jones", 123));
        list.add(new Employee("John", "Doe", 4567));
        list.add(new Employee("Marry", "Smith", 22));
        list.add(new Employee("Mike", "Wilson", 3245));

        list.forEach(employee -> System.out.println(employee));
    }
}


