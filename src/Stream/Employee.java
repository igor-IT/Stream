package Stream;

import java.util.Objects;

public class Employee {
    private int sel;

    public Employee(int sel) {
        this.sel = sel;
    }

    public int getSel() {
        return sel;
    }

    public void setSel(int sel) {
        this.sel = sel;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "sel=" + sel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return sel == employee.sel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sel);
    }
}
