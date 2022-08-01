package by.epam.tr.main2;

public class TriangleView {
	public void printRool(Triangle triangle) {
		if ((triangle.getSideA() + triangle.getSideB() <= triangle.getSideC())
				|| ((triangle.getSideB() + triangle.getSideC()) <= triangle.getSideA())
				|| ((triangle.getSideA() + triangle.getSideC()) <= triangle.getSideB())) {
			System.out.println("SideA = " + triangle.getSideA() + ", sideB = " + triangle.getSideB() + ", sideC= "
					+ triangle.getSideC());
			System.out.println("The data entered is incorrect, please change");
		} else {
			System.out.println("SideA = " + triangle.getSideA() + ", sideB = " + triangle.getSideB() + ", sideC= "
					+ triangle.getSideC());
		}
	}

	public void printPerimeter(Triangle triangle) {
		TriangleLogicA perimeter = new TriangleLogicA();
		perimeter.perimeter(triangle);
		System.out.println("Perimeter = " + perimeter);

	}

	public void printSquare(Triangle triangle) {
		TriangleLogicA square = new TriangleLogicA();
		square.square(triangle);
		System.out.println("Square = " + square);

	}

}
