public abstract class Conta{
	protected String nroConta;
	protected String titular;
	protected double saldo;
	

	public double getBalance(){
		return this.saldo;
	}
	public String getAccntNumber(){
		return this.nroConta;
		
	}
	public void deposit(double dep){
		this.saldo=saldo + dep;
	}
	public  double processCheque(int chequeAmount){
		if(this.saldo<1000)
		{
			this.saldo = saldo -(chequeAmount+0.15);
			return saldo;
		}
		else
			this.saldo = saldo -chequeAmount;
			return saldo;
	}
	
}
