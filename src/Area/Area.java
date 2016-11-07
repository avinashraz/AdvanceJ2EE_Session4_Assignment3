package Area;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int j = scanner.nextInt();
Triangle area = new Triangle(i,j);
System.out.println("The area of rectangle is = "+area.getRectangle());
System.out.println("The area of triangle is = "+area.gettriangle());
	}

}
