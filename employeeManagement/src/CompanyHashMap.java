import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CompanyHashMap {
    // Collection to store the assignments of employees to departments
    private Map<Employee, Department> employeeDepartmentMap;

    public CompanyHashMap() {
        employeeDepartmentMap = new HashMap<>();
    }

    // Instruction 2: Add Employee to Department
    public void addEmployeeDepartment(Employee e, Department d) {
        if (employeeDepartmentMap.containsKey(e)) {
            System.out.println("Employee " + e.getFirstName() + " " + e.getLastName() + " is already assigned to a department.");
        } else {
            employeeDepartmentMap.put(e, d);
            System.out.println("Employee " + e.getFirstName() + " " + e.getLastName() + " has been assigned to " + d.getName() + " department.");
        }
    }

    // Instruction 3: Display Employees and Departments
    public void displayEmployeesAndDepartments() {
        for (Map.Entry<Employee, Department> entry : employeeDepartmentMap.entrySet()) {
            System.out.println(entry.getKey() + " is assigned to " + entry.getValue().getName() + " department.");
        }
    }

    // Instruction 4: Remove Employee
    public void removeEmployee(Employee e) {
        if (employeeDepartmentMap.containsKey(e)) {
            employeeDepartmentMap.remove(e);
            System.out.println("Employee " + e.getFirstName() + " " + e.getLastName() + " has been removed.");
        } else {
            System.out.println("Employee not found in the collection.");
        }
    }

    // Instruction 5: Remove Employee from a specific Department
    public void removeEmployeeAndDepartment(Employee e, Department d) {
        if (employeeDepartmentMap.containsKey(e) && employeeDepartmentMap.get(e).equals(d)) {
            employeeDepartmentMap.remove(e);
            System.out.println("Employee " + e.getFirstName() + " " + e.getLastName() + " has been removed from " + d.getName() + " department.");
        } else {
            System.out.println("Employee " + e.getFirstName() + " " + e.getLastName() + " is not in the " + d.getName() + " department.");
        }
    }

    // Instruction 6: Display Employees (just the list of employees)
    public void displayEmployees() {
        for (Employee e : employeeDepartmentMap.keySet()) {
            System.out.println(e);
        }
    }

    // Instruction 7: Display Departments (just the list of departments)
    public void displayDepartments() {
        Set<Department> departments = Set.copyOf(employeeDepartmentMap.values());
        for (Department d : departments) {
            System.out.println(d);
        }
    }

    // Instruction 8: Search for an Employee in the collection
    public boolean searchEmployee(Employee e) {
        return employeeDepartmentMap.containsKey(e);
    }

    // Instruction 9: Search for a Department in the collection
    public boolean searchDepartment(Department d) {
        return employeeDepartmentMap.containsValue(d);
    }

    // Instruction 10: Sort the collection by Employee ID using TreeMap
    public TreeMap<Employee, Department> sortMap() {
        return new TreeMap<>(employeeDepartmentMap);
    }
}
