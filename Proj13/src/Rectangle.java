
public class Rectangle extends TwoDimensionalShapes implements IArea, IPrintatableShape {

	private int width;
	private int heigth;
	
	public Rectangle(String name, int w, int h) {
		super(name);
		this.heigth = h;
		this.width = w;
	
	}
	

	@Override
	public void printShape() {
		System.out.println("The area of " + name + " (2D Shape) is: " + this.calculateArea());
		
	}

	@Override
	public double calculateArea() {
		
		return width * heigth;
	}

}
