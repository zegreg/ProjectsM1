import java.util.ArrayList;


public class GeometricsShapeContainer extends GeometricsShape {
	
	
	GeometricsShape[] geometricsShape;
	private int maxShapes;
	private int countShapes;

	public GeometricsShapeContainer(String name, int maxShapes) {
		super(name);
		this.maxShapes = maxShapes;
		this.countShapes = 0;
		geometricsShape = new  GeometricsShape[maxShapes];
	}
	
	
	public void add(GeometricsShape gs){
		
		if (countShapes < maxShapes)
		{
			geometricsShape[countShapes] = gs;
			countShapes++;
		}
		
	}
		

	public void listShapes(){
		
		System.out.println("Shapes ");
		for (int i = 0; i < geometricsShape.length; i++) {
			geometricsShape[i].printShape();
		}
		
		
	}
	
	public void list2DShapes(){

		System.out.println("2D Shapes ");
		for (int i = 0; i < geometricsShape.length; i++) {
			if(geometricsShape[i] instanceof TwoDimensionalShapes){
				geometricsShape[i].printShape();
			}
		}

	}

	public void list3DShapes(){
		System.out.println("3D Shapes ");
		for (int i = 0; i < geometricsShape.length; i++) {
			if(geometricsShape[i] instanceof ThreeDimensionalShapes){
				geometricsShape[i].printShape();
			}
		}
	}

}
