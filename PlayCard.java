public class PlayCard {
	private int cardNumber;
	private String holderName;
	double amount;
	 int totalPoints;
	public int getCardNumber() {
		return this.cardNumber;
		}
	public void setCardNumber(int cardNumber) {
		 this.cardNumber=cardNumber;
	}
	public String getHolderName() {
		return this.holderName;
	}
public void setHolderName(String holderName) {
	 this.holderName=holderName;
}
public double getAmount(){
	return this.amount;
}
public void setAmount(double amount)
{
	this.amount=amount;
}
public int getTotalpoint() {
	return this.totalPoints;
}
public void setTotalPoint(int totalPoint)
{
	this.totalPoints=totalPoint;
}
public PlayCard(int cardNumber,String holderName ,double amount)
{
	this.cardNumber=cardNumber;
	this.holderName=holderName;
	this.amount=amount;
}
public void calculateTotalpoint()
{
	this.totalPoints=(int)(this.amount*20)/100;
}
public int calculateBalance(int minutesToPlay)
{
	int minutes=minutesToPlay;
	int PlayPoints=((minutes/60)*50);
	int balancePoints=totalPoints-PlayPoints;
	if(balancePoints<0) {
		return(-1);
	}
	else
		return balancePoints;
	
	}
	
}
