
public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(String aNumber,String aHolder,double cBalance){
		nroConta = aNumber;
		titular = aHolder;
		saldo = cBalance;
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
