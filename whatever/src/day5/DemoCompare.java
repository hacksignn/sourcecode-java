package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {

	private int id;
	private String name;
	private double salary;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class DemoCompare {
	private static final class SortById implements Comparator<Employee> {
		@Override
		public int compare(Employee o1, Employee o2) {
			return (int) (o1.getId() - o2.getId());
		}
	}

	private static final class SortByIdDesc implements Comparator<Employee> {
		@Override
		public int compare(Employee o1, Employee o2) {
			return (int) (o2.getId() - o1.getId());
		}
	}

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "A", 100));
		employees.add(new Employee(2, "X", 50));
		employees.add(new Employee(3, "N", 200));

		Comparator<Employee> sortBySalaryDesc = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o2.getSalary() - o1.getSalary());
			}
		};
		Comparator<Employee> sortByName = (o1, o2) -> o1.getName().compareTo(o2.getName());
		Comparator<Employee> sortById = new SortById();
		Comparator<Employee> sortByIdDesc = new SortByIdDesc();
		Collections.sort(employees, sortBySalaryDesc);
		employees.forEach(System.out::println);

		Collections.sort(employees, sortByName);
		employees.forEach(System.out::println);

		Collections.sort(employees, sortByIdDesc);
		employees.forEach(System.out::println);
	}
}