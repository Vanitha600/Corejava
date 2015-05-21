
public class LoopExample {

	public static void main(String[] args) {
		String names[] = { "Rahul" , "Seema" , "Alen" , "Peter" , "Arun" };
		
		System.out.println("=======FOR=======");
		for(i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("======Enhanced for loop=======");
		for(String name: names) {
			System.out.println(name);
		}
		System.out.println("======While=======");
		int IdxWhile = 0;
		while(IdxWhile < names.length){
			System.out.println(names[IdxWhile++]);
		}
		System.out.println("======Do While=======");
		int IdxDoWhile = 0;
		do {
		System.out.println(names[IdxDoWhile++]);
		}
		while(IdxDoWhile<names.length);
		
		int flksIdx = 0;
		// if you want to have for loop run infinite number of times then use for(;;)
		while(true);{
			System.out.println("Hello Folks" + flksIdx++);
			if(flksIdx == 3000) {
				break;
		
		}
	}
		System.out.println("Hello guys");
	}
}
