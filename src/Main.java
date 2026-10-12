import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        //1 ci tapşırıq
        List<Integer> num = List.of(1,2,3,4,5,6);
        List<Integer> num1 = num.stream()
                .filter(num2 -> num2 % 2 == 0)
                .map(num2 -> num2 * num2)
                .toList();
        System.out.println(num1);

        //2 ci tapşırıq
        List<String> names = List.of("Elgun","Ali","Nurlan","Ismayil","Can");
        List<String> names1 =names.stream()
                .filter(s -> s.length() > 3)
                .distinct()
                .sorted((n1,n2) -> n1.length()-n2.length())
                .limit(3)
                .toList();
        System.out.println(names1);

        //3 cü tapşırıq
        List<Employee> employees = List.of(
                new Employee("Faiq","IT",2000,26),
                new Employee("Nigar","Marketing",2500,33),
                new Employee("Fuad","HR",1800,27)
        );

        Optional<Integer> highest = employees.stream()
                .max(e -> e.getSalary())



    }
}