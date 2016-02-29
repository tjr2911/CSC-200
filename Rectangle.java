import java.util.Scanner;

public class Rectangle {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a width for a rectangle");
		double width = keyboard.nextDouble();
		System.out.println("Enter a height for a rectangle");
		double height = keyboard.nextDouble();
		double perimeter = (2 * (width  + height));
		double area = width * height;

		System.out.println("The perimeter of the rectangle = \"" + perimeter + "\""
				+ "\n" + "The area of the rectangle = \"" + area + "\"");
	}
}

