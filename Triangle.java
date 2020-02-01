
class Triangle extends GeometricObject {
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
    
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	@Override
	public double getArea() {
		double halfPer = (side1 + side2 + side3)/2;
		double triangleArea = Math.sqrt(halfPer*(halfPer - side1)*(halfPer - side2)*(halfPer - side3));
		return triangleArea;
	}

	@Override
	public double getPerimeter() {
		double trianglePer = side1 + side2 + side3;
		return trianglePer;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	
	public String toString() {
	    return  "\ncolor: " + getColor() + " and filled: " + isFilled();
	}
	
}
	
	// Optional Second toString() Implementation:
	// Rather than using the GeometricObject get methods to access the color and filled variables in that class
	// I can return super.toString() in the Triangle toString() method, so that when it is implicitly called,
	// the GeometricObject toString() implementation is used.
	
	//public String toString() {
		//return super.toString()
	//}
	
	
	
	
