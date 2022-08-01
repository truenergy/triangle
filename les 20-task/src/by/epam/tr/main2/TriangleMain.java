package by.epam.tr.main2;

public class TriangleMain {
	public void main() {
		double[] apexA = new double[] { 1.5, 1.5 };
		double[] apexB = new double[] { 2.0, 2.0 };
		double[] apexC = new double[] { 3.0, 3.0 };
		
		Triangle triangle = new Triangle(apexA, apexB, apexC);

		TriangleView view = new TriangleView();
		TriangleLogicA logic = new TriangleLogicA();

		logic.sides(triangle);
		view.printRool(triangle);

		logic.perimeter(triangle);
		view.printPerimeter(triangle);

		logic.square(triangle);
		view.printSquare(triangle);

	}
}