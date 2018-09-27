package lesson190;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


//https://www.mkyong.com/java8/java-8-lambda-comparator-example/

public class Employee implements Comparable<Employee> {
    String name;
    BigDecimal salary;

    public Employee() {
        this.name = name;
        this.salary = salary;
    }


    public Employee(String name, BigDecimal salary) {

        this.name = name;
        this.salary = salary;
    }


    public static int test(Fun fun) {
        return fun.fun("test", "Тесты");

    }


    public static void main(String[] args) {

        Fun fun = (String x, String y) -> x.compareToIgnoreCase(y);
        System.out.println(test(fun));

        Fun fun1 = (String x, String y) -> x.compareToIgnoreCase(y);
        int t = fun1.fun("Test", "fdff");
        System.out.println(t);


        Fun fun2 = String::compareToIgnoreCase;
        int t2 = fun2.fun("test2", "test");
        System.out.println(t2);


        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Test1", BigDecimal.valueOf(50.00));
        staff[1] = new Employee("Test2", BigDecimal.valueOf(43.0));
        staff[2] = new Employee("Test2", BigDecimal.valueOf(56));

        System.out.println(Arrays.toString(staff));

        Arrays.sort(staff, Comparator.comparing(o -> o.salary));

        //System.out.println(Arrays.toString(staff));

//
        System.out.println(Arrays.toString(staff));

//     System.out.println(Paths.get("Employee","jre"));

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        return salary.compareTo(employee.salary);
    }
}
