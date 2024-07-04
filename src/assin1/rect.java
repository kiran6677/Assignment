package assin1;

import java.util.Scanner;

public class rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner kc= new Scanner(System.in);
          
          System.out.println("enter the area of peremeter");
          double length  = kc.nextDouble();
          System.out.println();
          System.out.println("enter paremeter of area");
          double width = kc.nextDouble(); 
        
          ;
		double area= length * width;
          double peremeter = 2 * (length+width);
          
          System.out.println("area of reactanle is:" +area);
          System.out.println("area of peremter:" +peremeter);
          
          
          
          
          
	}

}
