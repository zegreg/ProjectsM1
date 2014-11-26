
public class RectangularPrism extends ThreeDimensionalShapes implements IVolume, IPrintatableShape{
	
	private int heigth;
	private int width;
	private int length;

	public RectangularPrism(String name, int h, int w , int l) {
		super(name);
		this.heigth = h;
		this.length = l;
		this.width = w;
	}

	@Override
	public void printShape() {
		System.out.println("The area of " + name + " (2D Shape) is: " + this.calculateVolume());
		
	}

	@Override
	public double calculateVolume() {
	
		return heigth * length * width;
	}

}
