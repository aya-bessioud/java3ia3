public class Main {
    public static void main(String[] args) {
        CompanyArrayList company = new CompanyArrayList();

        Employee e1 = new Employee(101, "Smith", "John", "IT", 3);
        Employee e2 = new Employee(102, "Doe", "Jane", "HR", 2);
        Employee e3 = new Employee(103, "Brown", "Lisa", "IT", 4);

        company.addEmployee(e1);
        company.addEmployee(e2);
        company.addEmployee(e3);

        System.out.println("\nAll Employees:");
        company.displayEmployee();

        System.out.println("\nSorted by ID:");
        company.sortEmployeeById();
        company.displayEmployee();

        System.out.println("\nSorted by Department & Grade:");
        company.sortEmployeeByDepartementNameAndGrade();
        company.displayEmployee();
    }
}
