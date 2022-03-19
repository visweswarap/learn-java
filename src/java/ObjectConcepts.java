public class ObjectConcepts {
    public static void main(String[] args) {
        // String employeeId, String firstname, String lastname, Double salary, String email
        ObjectConcepts concepts = new ObjectConcepts();
        Employee vish = new Employee("1234", "Vish", "Pepala", 123.45, "a@a.com");
        concepts.calculateBonus(vish);
        Employee andrei = new Employee("1235", "Andrei", "K", 500.23, "xxx@a.com");
        concepts.calculateBonus(andrei);
        concepts.calculateBonus(andrei, 12.06f);
    }

    void calculateBonus(Employee employee){
        int bonusPercentage = 10;
        System.out.print("Bonus is: ");
        System.out.println((employee.getSalary()*bonusPercentage)/100);
    }

    void calculateBonus(Employee employee, float bonusPercentage){
        System.out.println((employee.getSalary()*bonusPercentage)/100);
    }

    void calculateBonus(Employee employee, int bonusPercentage){
        System.out.println((employee.getSalary()*bonusPercentage)/100);
    }

}
