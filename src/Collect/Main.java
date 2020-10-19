package Collect;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

    }

    public static Map<EnumStat, Integer> mapNameToSalart(List<Employee> employees) {
       return employees.stream().collect(Collectors.toMap(f->f.getEnumStat(),x->x.getSalary()));
    }

    public static Map<EnumStat,List<Employee>> mapBySalary(List<Employee> employees) {
        Map<EnumStat, List<Employee>> map = employees.stream().collect(Collectors.groupingBy(employee -> EnumStat.findDySalary(employee.getSalary())));
        return map;
    }
}

