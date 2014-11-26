
public class Square extends TwoDimensionalShapes implements IArea, IPrintatableShape {

	private int side;
	
	
	public Square(String name, int s) {
		super(name);
		this.side = s;
	}


	@Override
	public void printShape() {
		System.out.println("The area of " + name + " (2D Shape) is: " + this.calculateArea());
		
	}


	@Override
	public double calculateArea() {
		
		return Math.pow(side, 2);
	}

}
