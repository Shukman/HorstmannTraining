package Training160515;

import java.util.Random;

public class ConstructorTest {
	
	public static void main(String[] args) {
		
		//заполнить массив staff тремя объектами типа Employee
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Harry", 40000);
		staff[1] = new Employee(60000);
		staff[2] = new Employee();
		
		//вывести данные обо всех объектах типа Employee
		for (Employee e : staff) {
			System.out.println("name = " + e.getName() + ", id = " + e.getId() + ", salary = " + e.getSalary());
		}
	}
}
class Employee { 
	private static int nextId;
	
	private int id;
	private String name = ""; // инициализация поля экземпляра
	private double salary;
	
	//статический блок инициализации
	static {
		Random generator = new  Random();
		//задать произвольное число 0 - 999 в поле nextId
		nextId = generator.nextInt(10000);
	}
	//блок инициализации объекта
	{
		id = nextId;
		nextId++;
	}
	//три перегружаемых конструктора
	public Employee(String n, double s){
		name = n;
		salary = s;
	}
	public Employee(double s){
		//вызвать конструктор Employee(String n, double s)
		this("Employee #" + nextId, s);
	}
	//конструктор без аргументов
	public Employee(){
		//полу name инициализируется пустой стройкой "" - см. ниже
		//поле salary не устанавливается явно, а инициализируется нулем
		//поле id инициализируется в блое инициализации
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
}
