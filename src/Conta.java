public class Conta extends Object{
	private String accountNumber;
	private String accountHolder;
	private double currentBalance;
	
	public Conta(String aNumber,String aHolder,double cBalance){
		accountNumber = aNumber;
		accountHolder = aHolder;
		currentBalance = cBalance;
	}
	public double getBalance(){
		return this.currentBalance;
	}
	public String getAccntNumber(){
		return this.accountNumber;
		
	}
	public void deposit(double dep){
		this.currentBalance=currentBalance + dep;
	}
	public  double processCheque(int chequeAmount){
		if(this.currentBalance<1000)
		{
			this.currentBalance = currentBalance -(chequeAmount+0.15);
			return currentBalance;
		}
		else
			this.currentBalance = currentBalance -chequeAmount;
			return currentBalance;
	}
	@Override
	public String toString(){
		return String.format("%s: %s \n%s: %s \n%s: %s","Name",accountHolder,"Account Number",accountNumber,"Account Balance",currentBalance);
	}
}
