import org.omg.CORBA.portable.ApplicationException;


public class Ex1 {

	/** José Oliveira 16/10/2014
	 * This application receives the height and width of a quadrilateral and draw it with asterisks
	 */
	public static void main(String[] args) {
		int x = 4;
		int y = 5;

		int [][] points = getPoints(x, y);

		printPoints(points);
	
	}
		
		
	public static  int[][] getPoints(int x, int y) {
		// ASCII code
		int  ast = 42;
		int space = 32;
		int [][] squareAst = new int [y][x];
        

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (i==0 || i == 5-1)
				{
					squareAst[i][j] = ast;
	
				}
				else if (j== 0 || j == 4-1) 
				{    squareAst[i][j] = ast;

				}
				
				else 
				{ 
					squareAst[i][j] = space;

				}
				
			}
		}
		return squareAst;
	}
		
	
	public static void printPoints(int [][] points) {

		for (int i = 0; i < 5; i++) {
			System.out.println(" ");
			for (int j = 0; j < 4; j++) {
				System.out.print((char)points[i][j]);
			}
			
		}

	}
}



