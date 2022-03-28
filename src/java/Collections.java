import java.util.*;

public class Collections {

    public static void main(String[] args) {
        Employee emp1 = new Employee("123", "aaa", "bbb", 0.0, null);
        Employee emp2 = new Employee("234", "bbb", "bbb", 0.0, null);
        Employee emp3 = new Employee("345", "ccc", "bbb", 0.0, null);
        Employee emp4 = new Employee("456", "ddd", "bbb", 0.0, null);
        Employee emp5 = new Employee("567", "eee", "bbb", 0.0, null);
        Employee emp6 = new Employee("678", "fff", "bbb", 0.0, null);
        Employee emp7 = new Employee("789", "ggg", "bbb", 0.0, null);
        // Map

        Map<String, Employee> empMap = new HashMap<>();
        empMap.put("aaa", emp1);
        empMap.put("bbb", emp2);
        empMap.put("ccc", emp3);
        empMap.put("ddd", emp4);
        empMap.put("eee", emp5);
        empMap.put("eee", emp6);
        empMap.put(null, emp6);
        boolean containsKey = empMap.containsKey("asdfasdf");

        Set<Employee> empSet = new HashSet<>();

        Employee employee = empMap.get(null);
        System.out.println(employee.getEmployeeId());
    }
}
