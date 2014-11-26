
public class Triangle extends TwoDimensionalShapes implements IArea {

	
	private int base;
	private int heigth;
	
	public Triangle(String name, int b, int h) {
		super(name);
		this.base =b;
		this.heigth = h;
	}

	@Override
	public double calculateArea() {
		
		return (base * heigth) /2;
	}

}
