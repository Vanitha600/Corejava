package assignment.constructor;

public class Employee {
	String name;
	int age;
	int salary;
	int empId;

		public Employee(String assignedname, int assignedage) {
			name = assignedname;
			age = assignedage;
			
		}
		public Employee(String assignedname, int assignedage, int assignedsalary) {
			/*name = assignedname;
			age = assignedage;*/
			this(assignedname, assignedage);
			salary = assignedsalary;
		}
		public Employee(String assignedname, int assignedage, int assignedsalary, int assignempId) {
			/*name = assignedname;
			age = assignedage;
			salary = assignedsalary;*/
			this(assignedname, assignedage, assignedsalary);
			empId = assignempId;
		}
	}


