import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartmentHashset implements IDepartment<Department> {
    private Set<Department> departments;

    public DepartmentHashset() {
        departments = new HashSet<>();
    }

    @Override
    public void addDepartment(Department t) {
        departments.add(t);
    }

    @Override
    public boolean searchDepartment(String name) {
        for (Department d : departments) {
            if (d.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean searchDepartment(Department t) {
        return departments.contains(t);
    }

    @Override
    public void deleteDepartment(Department t) {
        departments.remove(t);
    }

    @Override
    public void displayDepartment() {
        for (Department d : departments) {
            System.out.println(d);
        }
    }

    @Override
    public TreeSet<Department> sortDepartmentById() {
        return new TreeSet<>(departments); // Uses Comparable (by ID)
    }
}
