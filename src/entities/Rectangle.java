package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double AreaRectangle() {
		return width * height;
	}

	public double PerimeterRectangle() {
		return 2 * (width + height);
	}
	
	public double DiagonalRectangle() {
		return Math.sqrt(width * width + height * height);
	}
}
