import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Part 1: CompanyArrayList
        CompanyArrayList company1 = new CompanyArrayList();

        Employee e1 = new Employee(101, "Smith", "John", "IT", 3);
        Employee e2 = new Employee(102, "Doe", "Jane", "HR", 2);
        Employee e3 = new Employee(103, "Brown", "Lisa", "IT", 4);

        company1.addEmployee(e1);
        company1.addEmployee(e2);
        company1.addEmployee(e3);

        System.out.println("\nAll Employees:");
        company1.displayEmployee();

        System.out.println("\nSorted by ID:");
        company1.sortEmployeeById();
        company1.displayEmployee();

        System.out.println("\nSorted by Department & Grade:");
        company1.sortEmployeeByDepartementNameAndGrade();
        company1.displayEmployee();

        // Part 2: DepartmentHashset
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

        // Part 3: CompanyHashMap
        CompanyHashMap company2 = new CompanyHashMap();

        // Create departments
        Department itDepartment = new Department(101, "IT", 30);
        Department hrDepartment = new Department(102, "HR", 20);

        // Create new employees (using new variables to avoid conflict)
        Employee e4 = new Employee(1, "Smith", "John", "IT", 3);
        Employee e5 = new Employee(2, "Doe", "Jane", "HR", 2);
        Employee e6 = new Employee(3, "Brown", "Lisa", "IT", 4);

        // Add employees to departments
        company2.addEmployeeDepartment(e4, itDepartment);
        company2.addEmployeeDepartment(e5, hrDepartment);
        company2.addEmployeeDepartment(e6, itDepartment);

        // Display Employees and Departments
        System.out.println("\nDisplaying Employees and Departments:");
        company2.displayEmployeesAndDepartments();

        // Try to add the same employee to two different departments
        company2.addEmployeeDepartment(e4, hrDepartment);

        // Remove employee e5
        company2.removeEmployee(e5);

        // Remove employee e6 from IT department
        company2.removeEmployeeAndDepartment(e6, itDepartment);

        // Display all employees
        System.out.println("\nDisplaying all Employees:");
        company2.displayEmployees();

        // Display all departments
        System.out.println("\nDisplaying all Departments:");
        company2.displayDepartments();

        // Search for Employee
        System.out.println("\nIs Employee e4 in the company? " + company2.searchEmployee(e4));

        // Search for Department
        System.out.println("\nIs IT Department in the company? " + company2.searchDepartment(itDepartment));

        // Sort employees by ID using TreeMap
        System.out.println("\nSorted Employee-Department pairs by Employee ID:");
        company2.sortMap().forEach((k, v) -> System.out.println(k + " -> " + v));



    }
}
