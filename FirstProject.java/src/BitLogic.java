
public class BitLogic {

	public static void main(String[] args) {
		String binary[] = {"0000", "0001", "0010", "0100", "0101", "0111", "1000",
							 "1010", "1011", "1100", "1101", "1100", 
							"1110", "1111"};
		

		int a = 5;// 0 1 0 1
		int b = 4;// 0 0 1 0
		
		
		int c = a|b;
		int d = a&b;
		int e = a^b;
		int f = (~a & b)|(a & ~b);
		int g = ~a & 0x0f;
		
		System.out.println(" a = " + binary [a]);
		System.out.println(" b = " + binary [b]);
		System.out.println(" a|b = " + binary [c]);
		System.out.println(" a&b = " + binary [d]);
		System.out.println(" a^b = " + binary [e]);
		System.out.println(" ~a&b|a&~b = " + binary [f]);
		System.out.println(" ~a & 0x0f = " + binary [g]);
		
	}

}
