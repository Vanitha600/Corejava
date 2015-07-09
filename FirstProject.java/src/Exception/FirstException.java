package Exception;

public class FirstException {

	public static void main(String[] args) {
		int ages[] = {10, 20, 30, 40, 50};
		int index;
		try {
			index = Integer.parseInt(args[0]);
		} catch (NumberFormatException exp) {
			index = 1;
			exp.printStackTrace();
		}
		
		int age;
		try {
			age = ages[index];
		} catch (ArrayIndexOutOfBoundsException exp) {
			age = 1000;
			System.out.println();
		}
		
		System.out.println(age);
	
			if(age > 30)
			{
				System.out.println("Age is more than 30");
				
			}else if(age < 1){
				System.out.println("Small kid");
				
			}
			else{
					System.out.println("Not sure");
				} 
	}
			
}
	



