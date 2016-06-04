package run;
import java.util.InputMismatchException;
import java.util.Scanner;

import shapes.Rectangle;
import shapes.Shape;
import shapes.Triangle;

public class Run {

	public static void main(String[] args) {
		int shapeType;
		Shape shape = null;
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Please select one of the shapes. Enter 1 for triangle. 2 - for rectangle");
			shapeType = scanner.nextByte();
			if (shapeType == 1) {
				shape = new Triangle();
				
			} else if (shapeType == 2) {
				shape = new Rectangle();
			}
			System.out.println("You selected " + shape.getName());
			fillSidesArray(shape, scanner);
			System.out.println("Result area of " + shape.getName() + " = " + shape.CalculateArea());			
		} catch (InputMismatchException ex) {
			System.err.println(ex);
		}
	}

	private static void fillSidesArray(Shape shape, Scanner scanner) {
		for( int i= 0; i < shape.getSidesArray().length; i++){
			int sideNumber = i + 1;
			System.out.println("Enter " + sideNumber + " side:");
			int side = scanner.nextByte();
			shape.fillArrayElement(side, i);
		}
	}

}
