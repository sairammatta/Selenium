
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		;
		System.out.println(isPrime(22));
	}

			public static boolean isPrime(int num) {

	     boolean flag = false;
			for(int i=2;i<=num/2;++i){
	         
	          if(num%i==0)
	        	  flag=true;
	          break;
//	         System.out.println("true");
//	         System.out.println("false");

	        }
			
			if(!flag) {
				return true;
			}else
					return false;
			}
	         
	    }

