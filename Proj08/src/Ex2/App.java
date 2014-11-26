package Ex2;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CandyDispenser c = new CandyDispenser(20,2,4,2);
		c.serveBasic();
		c.serveBasic();
		c.refill(30);
		System.out.println( " Refill " + c.getCandyAmount());
		
		c.serveBasic();
		c.serveSpecial();
		c.serveSpecial();
		
		c.getValueOnSale(); //20(int)
		System.out.println(" getValueOnSale = 20 ," + c.getValueOnSale());
	
		c.getValueSold(); //20(int)
		System.out.println(" getValueSold = 20 ," +c.getValueSold());
		
		c.serveBasic();
		c.getValueOnSale(); //16(int)
		System.out.println( " getValueOnSale = 16 ," +c.getValueOnSale());
		
		c.getValueSold(); //24(int)
		System.out.println(" getValueSold = 24  ," +c.getValueSold());
		
		c.extractMoney();
		c.serveSpecial();
		c.serveSpecial();
		
		c.getValueSold(); //16(int)
		System.out.println(" getValueSold = 16 ," +c.getValueSold());
		
		c.refill(100);
		
		c.getValueOnSale();//40(int)
		System.out.println(" getValueOnSale = 40 ," + c.getValueOnSale());
		
		c.sellingRecord(); //24(int)
		System.out.println(" sellingRecord = 24, " + c.sellingRecord());
		
	}

}
