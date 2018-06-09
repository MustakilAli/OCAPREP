package chapter2;

public class SwitchIncre {

	public static void main(String[] args) {
		
	      char i; 
	        
	        LOOP:  for(i=0;i<5;i++) {
	            switch(i++) {
	            //	 default :
	            case 1:  System.out.println("B"); break LOOP;
	            case 'B': System.out.println("C"); 
	            case 3:  System.out.println("D"); break; 
	            
	            case 4: System.out.println("E"); break;
	            case 2: System.out.println("A"); 
	            case 'E': System.out.println("F");
	            
	            }
	        }
	        

	    }


		
		
	}

