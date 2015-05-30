package assignment.constructor;

public class EmployeeConstructor {

	public static void main(String[] args) {
		Employee emp = new Employee("Alen", 45, 45000);
		
		System.out.println(emp.name + "" + emp.age +" " + emp.salary);
	
		Employee emp1 = new Employee("Alex", 55, 55000);
	
		System.out.println(emp1.name + "" + emp1.age +" " + emp1.salary);
		
		Employee emp2 = new Employee("Alan", 50, 50000);
		
		System.out.println(emp1.name + "" + emp1.age +" " + emp1.salary);
	}
	
}
