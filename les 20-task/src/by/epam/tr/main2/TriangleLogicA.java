package by.epam.tr.main2;

public class TriangleLogicA {
	public void sides (Triangle triangle) {
		double sideA;
		sideA = Math.sqrt(
				(triangle.getApexB()[0] - triangle.getApexA()[0]) * (triangle.getApexB()[0] - triangle.getApexA()[0])
						+ (triangle.getApexB()[1] - triangle.getApexA()[1])
								* (triangle.getApexB()[1] - triangle.getApexA()[1]));
		
	
		double sideB;
		sideB = Math.sqrt(
				(triangle.getApexB()[0] - triangle.getApexC()[0]) * (triangle.getApexB()[0] - triangle.getApexC()[0])
						+ (triangle.getApexB()[1] - triangle.getApexC()[1])
								* (triangle.getApexB()[1] - triangle.getApexC()[1]));
		
		double sideC;
		sideC = Math.sqrt(
				(triangle.getApexC()[0] - triangle.getApexA()[0]) * (triangle.getApexC()[0] - triangle.getApexA()[0])
						+ (triangle.getApexC()[1] - triangle.getApexA()[1])
								* (triangle.getApexC()[1] - triangle.getApexA()[1]));
		triangle.setSideA(sideA);
		triangle.setSideB(sideB);
		triangle.setSideC(sideC);
		
}
	public void perimeter (Triangle triangle) {
		double perimeter;
		if ((triangle.getSideA() + triangle.getSideB() <= triangle.getSideC()) || ((triangle.getSideB() + triangle.getSideC()) <= triangle.getSideA()) || ((triangle.getSideA() + triangle.getSideC()) <= triangle.getSideB())) {
			throw new RuntimeException();
			
		} else {
			perimeter = triangle.getSideA()+ triangle.getSideB()+ triangle.getSideC();
			
		}
	}
	
	public double square (Triangle triangle) {
		double halfperimeter, square;
		if ((triangle.getSideA() + triangle.getSideB() <= triangle.getSideC()) || ((triangle.getSideB() + triangle.getSideC()) <= triangle.getSideA()) || ((triangle.getSideA() + triangle.getSideC()) <= triangle.getSideB())) {
			throw new RuntimeException();
			
		} else {
		halfperimeter = (triangle.getSideA()+ triangle.getSideB()+ triangle.getSideC())/2;
		square = Math.sqrt(halfperimeter * (halfperimeter - triangle.getSideA()) * (halfperimeter - triangle.getSideB())
				* (halfperimeter - triangle.getSideC()));
		
	}
		return square;
	}
}