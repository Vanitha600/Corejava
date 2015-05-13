
public class BitLogicWithoutArray {

	public static void main(String[] args) {
			int a = 4; // 0 1 0 0 in binary
			int b = 2; // 0 0 1 0 in binary
			
			int c = a|b;
			int d = a&b;
			int e = a^b;
			int f = (~a & b) | (a & ~b);
			int g = ~a & 0x0f;
			
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
			System.out.println(g);
	}

}
