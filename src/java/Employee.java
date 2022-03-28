import java.util.Objects;

public class Employee {

    private String employeeId;
    private String firstname;
    private String lastname;
    private double salary;
    private String email;

    Employee(String employeeId, String firstname, String lastname, double salary, String email){
        this.employeeId = employeeId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.email = email;
    }

    Employee(){
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && employeeId.equals(employee.employeeId) && firstname.equals(employee.firstname) && lastname.equals(employee.lastname) && email.equals(employee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, firstname, lastname, salary, email);
    }
}
