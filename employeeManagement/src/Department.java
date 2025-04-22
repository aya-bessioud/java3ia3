import java.util.Objects;

public class Department implements Comparable<Department> {
    private int id;
    private String name;
    private int numberOfEmployees;

    // No-arg constructor
    public Department() {}

    // Parameterized constructor
    public Department(int id, String name, int numberOfEmployees) {
        this.id = id;
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getNumberOfEmployees() { return numberOfEmployees; }
    public void setNumberOfEmployees(int numberOfEmployees) { this.numberOfEmployees = numberOfEmployees; }

    // Equals: based on ID and name
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Department)) return false;
        Department other = (Department) obj;
        return this.id == other.id && Objects.equals(this.name, other.name);
    }

    // HashCode (required for HashSet)
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // toString override
    @Override
    public String toString() {
        return "Department [ID=" + id + ", Name=" + name + ", NumberOfEmployees=" + numberOfEmployees + "]";
    }

    // Comparable implementation for sorting by ID
    @Override
    public int compareTo(Department other) {
        return Integer.compare(this.id, other.id);
    }
}
