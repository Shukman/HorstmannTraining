package Training160507;

import java.util.Date;
import java.util.GregorianCalendar;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		//заполнить масси staff тремя объектами типа Employee
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15, 17, 10, 15);
		staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1, 17, 15, 40);
		staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15, 17, 20, 25);
		
		//увеличить зарплату на 5%
		for (Employee e : staff) {
			e.raiseSalary(5);
		}
		//вывести данные обо всех объектах типа Employee
		for (Employee e : staff) {
			System.out.println("\nname = " + e.getName() + ", \nsalary = " + e.getSalary() + ", \nhireDay = " + e.getHireDay());
		}
	}
}
class Employee {
	private String name;
	private double salary;
	private Date hireDay;

	public Employee(String n, double s, int year, int month, int day, int hour, int minute, int sekond) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day, hour, minute, sekond);
		//в классе GregorianCalendar январь обозначается нулем
		hireDay = calendar.getTime();
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	public Date getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}
