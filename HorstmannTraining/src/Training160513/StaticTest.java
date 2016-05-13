package Training160513;

public class StaticTest {
	
	public static void main(String[] args) {
		
		//заполнить массив staff тремя объектами типа Employee
		Employee[] staf = new Employee[3];
		
		staf[0] = new Employee("Tom", 40000);
		staf[1] = new Employee("Dick", 60000);
		staf[2] = new Employee("Harry", 65000);
		
		//вывести данные обо всех объектаъ типа Employee
		for (Employee e : staf) {
			e.setId();
			System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary=" + e.getSalary());
		}
		int n = Employee.getNextId(); //вызвать статический метод
		System.out.println("Next available id=" + n);
	}
}
class Employee{
	private static int nextId = 1;
	
	private String name;
	private double salary;
	private int id;
	
	public Employee(String n, double s){
		
		name = n;
		salary = s;
		id = 0;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
	public int getId(){
		return id;
	}
	public void setId(){
		id = nextId; //установить следующий доступный идентификатор
		nextId++;
	}
	public static int getNextId(){
		return nextId; //возвратить статическое поле
	}
	
	public static void main(String[] args) { //выполнить блочный тест
		Employee e = new Employee("Harry", 50000);
		System.out.println(e.getName() + " " + e.getSalary());
	}
}