package classAndObject;

import java.time.Instant;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Product product1 = new Product();
//        product1.setProduct(1, "P001", "Product 1", 100.0, 10);
//        product1.displayProduct();
//
//        Book book1 = new Book();
//        book1.setBook(1, UUID.randomUUID().toString(), "Harry Porter", "This is Magic Book", Date.from(Instant.now()),new TreeSet<>(List.of("J.K. Rowling")));
////        book1.displayBook();
//        System.out.println(book1);

        Employee employee1 = new Employee();
        employee1.setEmployee(1, UUID.randomUUID().toString(), "John Doe", "Software Engineer", 1000.0);
//        System.out.println(employee1);

        Employee employee2 = new Employee();
        employee2.setEmployee(2, UUID.randomUUID().toString(), "Jane Doe", "Software Engineer", 1000.0);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);

        System.out.println("List of Employees" + employees);

        for (Employee em: employees) {
            System.out.println(em);

        }

    }
}
