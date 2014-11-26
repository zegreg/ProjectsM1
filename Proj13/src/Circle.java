
public class Circle extends TwoDimensionalShapes implements IArea, IPrintatableShape {

	
	private int radius;
	
	public Circle(String name, int r) {
		super(name);
		this.radius = r;
		
	}

	@Override
	public void printShape() {
		System.out.println("The area of " + name + " (2D Shape) is: " + this.calculateArea());
		
	}

	@Override
	public double calculateArea() {
		
		return Math.PI * Math.pow(radius, 2);
	}

	

	

}
