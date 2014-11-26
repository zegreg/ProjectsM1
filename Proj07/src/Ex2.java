
public class Ex2 {

	/**
	 * José Oliveira 16/10/2014
	 * This application received a integer array, a base and a base to convert.
	 * The main objective is to convert a number of a specific base to another base.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[] {2,2}; // 22 em base 10
		int base = 10;
		int convBase = 3;

		int decimalNumber = converterBaseToDecimal(num, base);

		int finalNum = baseDecimalConverter(decimalNumber, convBase);

		int[] result = convertTo(num, base, convBase);
		System.out.print("resul = [");
		for (int i = 0; i < result.length; i++) {
			System.out.print( (i == result.length-1) ? result[i] + "" : result[i]+ "," );

		}
		System.out.println("] = " + finalNum + " base " + convBase );



	}

	private static int[] convertTo(int[] num, int base, int convBase) {
		
		int decimalNumber = converterBaseToDecimal(num, base);
		
		int finalNum = baseDecimalConverter(decimalNumber, convBase);
		
		int numAux  = finalNum;
		
		int numAlgorismo = 0;
		
		  while (finalNum != 0) {
			finalNum /= 10;
			numAlgorismo ++;
			}
		 
		
		 int [] resArray = new int [numAlgorismo];
		 for (int i = 0; i < resArray.length; i++) {
			resArray [i] = (int) (numAux/(Math.pow(10, numAlgorismo-(i+1))));
			numAux %= Math.pow(10, numAlgorismo-(i+1));
			
			}
		
		return resArray;
	}
	
	private static int converterBaseToDecimal(int[] num, int base) {
		int i =0;
		int firstNumber = 0;
		while ( i< num.length) {
			firstNumber += (int) (num[i] * Math.pow(base, i));
		i++;
		}
		return firstNumber;
	}

	private static int baseDecimalConverter(int num, int convBase) {
		int numberResult = num;
		int resOriginal = numberResult;
				
		int str = 0;
		int i = 0;
		while (resOriginal != 0)
		{
			numberResult = (int) ((numberResult %= convBase) * (Math.pow(10, i)));
			
			str = numberResult+str;
			
			resOriginal /= convBase;
			numberResult = resOriginal;
			i++;
		}
		
		
		
		
		return str;
	}
}

	


