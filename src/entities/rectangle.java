package entities;

public class rectangle {

	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return width + width + height + height;
	}
	
	public double diagonal() {
		return Math.sqrt((height*height)+(width * width));
	}
}
