
public class TernaryOperator {

	public static void main(String[] args) {
			int age = 19;
			String name = (age > 18) ? "Adult" : "Child" ;
			

			if (age < 18) {
				name = "one";
			}else if(age > 18 && age < 21 ) {
				name = "two";
			}else if(age > 18 ) {
				name = "three";
			}else {
				name = "nothing";
			}
			
			
			if (age == 18) {
				name = "18";
			}else if(age == 19 ) {
				name = "19";
			}else if(age == 21 ) {
				name = "21";
			}else {
				name = "nothing";
			}
			
			
			if (age == 18) {
				name = "18";
			} if(age == 19 ) {
				name = "19";
			} if(age == 21 ) {
				name = "21";
			}
			
			}
			
	}


