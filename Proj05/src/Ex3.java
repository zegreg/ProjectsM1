import java.util.Scanner;


public class Ex3 {

	/** José Oliveira 9/10/2014
	 * Get the triangle' height input from user and show triangle Pascal
	 */
	public static void main(String[] args) {
 
		Scanner ler = new Scanner(System.in);  
		System.out.print("Triangle'height : ");  
		int nLines = ler.nextInt();  
		
		int pascalTriangle[][];  
		pascalTriangle = new int[nLines][nLines];  
		

		for (int i=0; i<nLines; i++)  
		{  
			System.out.println();  
			for(int j=0;j<=i;j++)  
			{  
				if ((j==0) || (i==j)) 
				{  
					pascalTriangle[i][j]=1;  
				}  
				
				if ((j!=0)&(i!=j))  
				{  
					pascalTriangle[i][j]=pascalTriangle[i-1][j-1]+pascalTriangle[i-1][j];  
				}  
				System.out.print(pascalTriangle[i][j]+"  ");  
			}  
		}  
	}  
}  

