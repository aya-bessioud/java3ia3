import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompanyArrayList implements IGestion<Employee> {

    private ArrayList<Employee> employeeList;

    public CompanyArrayList() {
        employeeList = new ArrayList<>();
    }

    @Override
    public void addEmployee(Employee e) {
        employeeList.add(e);
    }

    @Override
    public boolean searchEmployee(String name) {
        for (Employee e : employeeList) {
            if ((e.getFirstName() + " " + e.getLastName()).equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean searchEmployee(Employee t) {
        return employeeList.contains(t);
    }

    @Override
    public void deleteEmployee(Employee t) {
        employeeList.remove(t);
    }

    @Override
    public void displayEmployee() {
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void sortEmployeeById() {
        Collections.sort(employeeList);
    }

    @Override
    public void sortEmployeeByDepartementNameAndGrade() {
        employeeList.sort(Comparator
                .comparing(Employee::getDepartmentName)
                .thenComparing(Employee::getGrade));
    }
}
