package Converter;
import java.util.*;
public class Dollar {
	public void currency_convert(){
		double inr,usd,doll;
		System.out.println("n Dollar tp inr");
		Scanner in=new Scanner(System.in);
		System.out.println("Enter inr to convert into usd:");
		inr=in.nextDouble();
		System.out.println("Enter current usd rate:");
		doll=in.nextDouble();
		usd=inr/doll;
		System.out.println("\n Inr="+inr+"\n Usd="+usd);
	}


public void Distance_convert(){
	double km,meters;
	System.out.println("\n meter to kilometers:");
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the kilometer");
	km=in.nextDouble();
	meters=km*1000;
	System.out.println("\n meter="+meters);
	
	
}
public void Time_convert(){
	double minutes,seconds,hours;
	System.out.println("\n hours to minute and seconds");
	Scanner in=new Scanner (System.in);
	System.out.printf("Enter hours");
	hours=in.nextDouble();
	minutes=hours*60;
	seconds=hours*3600;
	System.out.println("\n hours in minutes="+minutes+"\n hours in seconds="+seconds);
}
}
