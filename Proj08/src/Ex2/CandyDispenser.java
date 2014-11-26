package Ex2;

public class CandyDispenser {

	int candyPrice;
	int candyAmount;
    int candyAmountBasic;
	int candyAmountSpecial;
	int maxCandyDispenser;
	int maxCandyDispenserBasic;
	int maxCandyDispenserSpecial;
	int candySold ;
	int maxCandySold;
	
	
	

	public CandyDispenser(int candyAmount, int candyAmountBasic,int candyAmountSpecial ,int candyPrice) {
		this.candyPrice= candyPrice;
		this.candyAmount = candyAmount;
		maxCandyDispenser = this.candyAmount;
		this.candyAmountBasic = candyAmountBasic;
		maxCandyDispenserBasic = this.candyAmountBasic;
		this.candyAmountSpecial = candyAmountSpecial;
		maxCandyDispenserSpecial = candyAmountSpecial;
		this.candySold = 0;
		this.maxCandySold = 0;
	
	}
	
	//************************************************************************************************	
	public int getCandyAmount() {
		return candyAmount;
	}


	public int getCandyAmountBasic() {
		return candyAmountBasic;
	}


	public int getCandyAmountSpecial() {
		return candyAmountSpecial;
	}

	public int getCandyPrice() {
		return candyPrice;
	}
	public int getCandySold() {
		return candySold;
	}
	
//******************************************************************************************************
	
	public void setCandyAmount(int candyAmount) {
		this.candyAmount = candyAmount;
	}
	
	 public void setCandyAmountBasic(int candyAmountBasic) {
		this.candyAmountBasic = candyAmountBasic;
	}
	 
	 public void setCandyAmountSpecial(int candyAmountSpecial) {
		this.candyAmountSpecial = candyAmountSpecial;
	}
	 
	 public void setCandyPrice(int candyPrice) {
		this.candyPrice = candyPrice;
	}
	 public void setCandySold(int candySold) {
		this.candySold += candySold;
	}
	
	
//*******************************************************************************************	
	
	
	
	
	 public void serveBasic(){
	
		 if (this.candyAmount >= this.candyAmountBasic) {
			 candyAmount -= candyAmountBasic;
			 setCandySold(candyAmountBasic) ;
			 if (maxCandySold < getCandySold()) {
					maxCandySold = getCandySold();
				}
			 
			
		 }
	 }

	 public void serveSpecial() {
				
		 if (this.candyAmount >= this.candyAmountSpecial) 
		 {
			 candyAmount -= candyAmountSpecial;
			 setCandySold(candyAmountSpecial) ;
			 if (maxCandySold < getCandySold()) {
				maxCandySold = getCandySold();
			}
			 
		 }
	}


	
	
	 public int getValueSold() {
		 int sold = getCandySold()* candyPrice;
		 return sold;

	 }

	public int getValueOnSale() {
		int sale = getCandyAmount() * candyPrice ;
		return sale;

	}
	public int extractMoney() {
		
		return candySold = 0;

	}

	public void refill(int units){
		
	int maxCandy = getCandyAmount() + units;
	
	if (maxCandy <= maxCandyDispenser) {
		setCandyAmount(maxCandy);
		this.candySold = 0;
		
	}  else {
		setCandyAmount(maxCandyDispenser);
		this.candySold = 0;
		
		
	}
		
	

	}

	public int sellingRecord() {
		
		
		return maxCandySold * candyPrice;

	}


	


}
