
public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(String aNumber,String aHolder,double cBalance){
		accountNumber = aNumber;
		accountHolder = aHolder;
		currentBalance = cBalance;
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

}
