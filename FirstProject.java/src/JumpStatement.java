
public class JumpStatement {

	public static void main(String[] args) {
		for( int i=0 ; i<10 ; i++) {
			System.out.println( i + " ");
			if( i % 2 == 0)
				continue;
			System.out.println(" ");
			}
		
		for(int i=0 ; i<10 ; i++) {
			if( i==7 )
			System.out.println( i );
			
			System.out.println( "hello" );
			}
		System.out.println( "\n I am done" );

	}

}
