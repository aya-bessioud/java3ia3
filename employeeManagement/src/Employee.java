import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int id;
    private String lastName;
    private String firstName;
    private String departmentName;
    private int grade;

    // No-arg constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(int id, String lastName, String firstName, String departmentName, int grade) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.departmentName = departmentName;
        this.grade = grade;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }

    public int getGrade() { return grade; }
    public void setGrade(int grade) { this.grade = grade; }

    // Equals: Based on id and name
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return this.id == other.id &&
                Objects.equals(this.lastName, other.lastName) &&
                Objects.equals(this.firstName, other.firstName);
    }

    // toString method
    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + firstName + " " + lastName +
                ", Department=" + departmentName + ", Grade=" + grade + "]";
    }

    // Comparable implementation (sort by ID)
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }
}
