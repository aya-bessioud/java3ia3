import java.util.TreeSet;

public interface IDepartment<T> {
    void addDepartment(T t);
    boolean searchDepartment(String name);
    boolean searchDepartment(T t);
    void deleteDepartment(T t);
    void displayDepartment();
    TreeSet<T> sortDepartmentById();
}
