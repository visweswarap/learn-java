public class ObjectConcepts {
    public static void main(String[] args) {
        // String employeeId, String firstname, String lastname, Double salary, String email
        ObjectConcepts concepts = new ObjectConcepts();
        System.out.println(concepts);
        Employee vish = new Employee("1234", "Vish", "Pepala", 123.45, "a@a.com");
        Employee vish1 = new Employee("1234", "Vish", "Pepala", 123.44, "a@a.com");
        System.out.println(vish.hashCode());
        System.out.println(vish1.hashCode());
        if(vish == vish1){
            System.out.println("Both Objects are same  ==");
        } else if (vish.equals(vish1)){
            System.out.println("Both Objects are same equals..");
        } else{
            System.out.println("Both Objects are NOT same...");
        }

        Employee andrei = new Employee("1235", "Andrei", "K", 500.23, "xxx@a.com");
        concepts.calculateBonus(andrei);
        concepts.calculateBonus(andrei, 12.06f);
    }

    public Double calculateBonus(Employee employee){
        int bonusPercentage = 10;
        System.out.print("Bonus is: ");
        System.out.println((employee.getSalary()*bonusPercentage)/100);
        return (Double) ((employee.getSalary()*bonusPercentage)/100);
    }

    public void calculateBonus(Employee employee, float bonusPercentage){
        System.out.println((employee.getSalary()*bonusPercentage)/100);
    }

    void calculateBonus(Employee employee, int bonusPercentage){
        System.out.println((employee.getSalary()*bonusPercentage)/100);
    }

}
