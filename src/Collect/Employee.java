package Collect;


import java.util.Objects;

public class Employee {
    private EnumStat enumStat;
    private int salary;


    public Employee(EnumStat enumStat, int salary) {
        this.enumStat = enumStat;
        this.salary = salary;
    }

    public EnumStat getEnumStat() {
        return enumStat;
    }

    public void setEnumStat(EnumStat enumStat) {
        this.enumStat = enumStat;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary &&
                enumStat == employee.enumStat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(enumStat, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "enumStat=" + enumStat +
                ", salary=" + salary +
                '}';
    }
}
