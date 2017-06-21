package wipro;
import java.util.Scanner;
public class Numberrev {

	public static void main(String[] args) {
		 int s,n1=0,r;
	    	        Scanner d=new Scanner(System.in);
	        System.out.println("enter the number");
	       s=d.nextInt();
	       while(s>0)
	       {
	           r=s%10;
	           n1=n1*10+r;
	           s=s/10;
	       }
	       System.out.println(n1);

	}

}
