
public class Cone  extends ThreeDimensionalShapes implements IPrintatableShape, IVolume{
	
	private int radius;
	private int heigth;

	public Cone(String name, int r, int h) {
		super(name);
		this.heigth =  h;
		this.radius = r;
	}

	@Override
	public double calculateVolume() {
		
		return Math.pow(radius, 2) * Math.PI * heigth / 3;
	}

	@Override
	public void printShape() {
		System.out.println("The area of " + name + " (2D Shape) is: " + this.calculateVolume());
		
	}

}
