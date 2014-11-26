
public class Sphere extends ThreeDimensionalShapes implements IVolume{

	private int radius;
	
	
	public Sphere(String name, int r) {
		super(name);
		this.radius = r;
	}


	@Override
	public double calculateVolume() {
		
		return 4 * Math.PI * Math.pow(radius, 3) / 3;
	}

}
