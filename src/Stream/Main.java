package Stream;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee(12),new Employee(19),new Employee(15), new Employee(20));
        countSalary(employees);
    }

    public static void countSalary(List<Employee> employees){
        int sum = employees.stream().mapToInt(f -> f.getSel()).sum();
        System.out.println(sum);
    }

    public static void sortedWords(File file){
        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
            bf.lines().flatMap(f -> Arrays.stream(f.split("\\W+"))).sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static long countWords(File file){
        long sum = 0;
        try {
           BufferedReader bf =  new BufferedReader(new FileReader(file));
           //sum = bf.lines().flatMap(f -> Arrays.stream(f.split("\\W+"))).count();
            bf.lines().flatMap(f -> Arrays.stream(f.split("\\W+"))).sorted(String::compareToIgnoreCase).collect(Collectors.toList());
           return  sum;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sum;
    }
}
