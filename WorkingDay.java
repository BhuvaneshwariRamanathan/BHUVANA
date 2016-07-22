package guvi;

import java.util.Scanner;

public class WorkingDay {

	/**
	 * @param args
	 */
public static boolean workingDay(String a){
	if(a.equalsIgnoreCase("Sunday")){
		return true;
	}
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the day");
String str=s.nextLine();
System.out.println(workingDay(str));
s.close();

	}

}
