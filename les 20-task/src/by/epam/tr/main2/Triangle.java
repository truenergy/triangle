package by.epam.tr.main2;

import java.util.Arrays;
import java.util.Objects;

public class Triangle {
	private double[] apexA;
	private double[] apexB;
	private double[] apexC;
	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle() {
		apexA = new double[2];
		apexB = new double[2];
		apexC = new double[2];

	}

	public Triangle(double []apexA, double[] apexB, double[] apexC) {
		this.apexA = new double[2];
		this.apexB = new double[2];
		this.apexC = new double[2];
	}

	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA = 1.0;
		this.sideA = 2.0;
		this.sideA = 1.5;
	}

	public double[] getApexA() {
		return apexA;
	}

	public void setApexA(double[] apexA) {
		this.apexA = apexA;
	}

	public double[] getApexB() {
		return apexB;
	}

	public void setApexB(double[] apexB) {
		this.apexB = apexB;
	}

	public double[] getApexC() {
		return apexC;
	}

	public void setApexC(double[] apexC) {
		this.apexC = apexC;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(apexA);
		result = prime * result + Arrays.hashCode(apexB);
		result = prime * result + Arrays.hashCode(apexC);
		result = prime * result + Objects.hash(sideA, sideB, sideC);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		return Arrays.equals(apexA, other.apexA) && Arrays.equals(apexB, other.apexB)
				&& Arrays.equals(apexC, other.apexC)
				&& Double.doubleToLongBits(sideA) == Double.doubleToLongBits(other.sideA)
				&& Double.doubleToLongBits(sideB) == Double.doubleToLongBits(other.sideB)
				&& Double.doubleToLongBits(sideC) == Double.doubleToLongBits(other.sideC);
	}

	@Override
	public String toString() {
		return "Triangle [apexA=" + Arrays.toString(apexA) + ", apexB=" + Arrays.toString(apexB) + ", apexC="
				+ Arrays.toString(apexC) + ", sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
	}

}
