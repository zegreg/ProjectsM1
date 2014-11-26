import java.awt.List;


public   abstract class GeometricsShape implements IPrintatableShape{

	public String name;
	
	public GeometricsShape(String name) {
	this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void listShapes();
	
	@Override
	public void printShape() {
		
		
	}
	
	
}
