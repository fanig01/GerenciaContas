public abstract class Conta{
	protected String nroConta;
	protected String titular;
	protected double saldo;
	

	public double getSaldo(){
		return this.saldo;
	}
	public String getNroConta(){
		return this.nroConta;
		
	}
	public void deposit(double dep){
		this.saldo=saldo + dep;
	}
	public  double processarSaque(int quantia){
		if(this.saldo<1000)
		{
			this.saldo = saldo -(quantia+0.15);
			return saldo;
		}
		else
			this.saldo = saldo -quantia;
			return saldo;
	}
	//reescrevendo
	public String toString(){
		return String.format("%s: %s \n%s: %s \n%s: %s","Nome do Titular:",titular,"Numero da Conta",nroConta,"Saldo",saldo);
	}
}
