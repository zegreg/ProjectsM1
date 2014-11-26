
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricsShape square = new Square("Square", 3);
		GeometricsShape cube = new RectangularPrism("Cube", 5, 5, 5);
		GeometricsShape rectangularPrism = new RectangularPrism("NotACube", 3,
				4, 5);
		GeometricsShape circle = new Circle("Circle", 4);
		GeometricsShape cone = new Cone("Cone", 4, 6);
		GeometricsShape sphere = new Sphere("Sphere", 6);
		GeometricsShape triangle = new Triangle("Triangle", 3, 6);
		GeometricsShape rectangle = new Rectangle("Rectangle", 4, 5);
		GeometricsShapeContainer tds = new GeometricsShapeContainer("Shapes", 8);
		tds.add(square);
		tds.add(cube);
		tds.add(rectangularPrism);
		tds.add(circle);
		tds.add(cone);
		tds.add(sphere);
		tds.add(triangle);
		tds.add(rectangle);
		tds.listShapes();
		System.out.println();
		tds.list2DShapes();
		System.out.println();
		tds.list3DShapes();
	}

}
