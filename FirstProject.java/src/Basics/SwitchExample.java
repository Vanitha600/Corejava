package Basics;


public class SwitchExample {

	public static void main(String[] args) {

				int age = 20;
				String name = (age > 18) ? "Adult" : "Child" ;
					long starttime =0, endtime =0;
					
					starttime = System.currentTimeMillis();
					for( i = 0 ; i < 5000 ; i++){
						
					if (age == 18) {
					name = "18";
					}else if( age == 19 ) {
					name = "19";
					}else if(age == 20 ) {
					name = "20";
					}else if( age == 21 )
						name = "21";
					}else {
					name = "nothing";
				}
			}
				endtime = System.currentTimemillis();
				
				System.out.println("Ifelse Performance" + (endtime - starttime));
				
				starttime = System.currentTimeMillis();
				for( i = 0 ; i < 5000 ; i++){
					
				switch(age) {
				case 18: 
					name = "18";
					break;
				case 19: 
					name = "19";
					break;
				case 20: 
					name = "20";
					break;
				case 21:{ 
					name = "21";
					break;
				}
				default: 
					name = "nothing";
					break;
					}
				}
			endtime = System.currentTimeMillis();
			System.out.println("switch performance" +(endtime - starttime));
			}
			
		}
