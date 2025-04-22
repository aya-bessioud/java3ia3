import java.util.TreeSet;

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


        DepartmentHashset deptManager = new DepartmentHashset();

        Department d1 = new Department(101, "IT", 30);
        Department d2 = new Department(102, "HR", 20);
        Department d3 = new Department(100, "Finance", 15);

        deptManager.addDepartment(d1);
        deptManager.addDepartment(d2);
        deptManager.addDepartment(d3);

        System.out.println("\nAll Departments:");
        deptManager.displayDepartment();

        System.out.println("\nSorted Departments by ID:");
        TreeSet<Department> sortedDepartments = deptManager.sortDepartmentById();
        for (Department d : sortedDepartments) {
            System.out.println(d);
        }

        System.out.println("\nSearch Department by Name 'IT': " + deptManager.searchDepartment("IT"));
    }
}
