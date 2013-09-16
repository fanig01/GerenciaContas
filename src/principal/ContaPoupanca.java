package principal;

public class ContaPoupanca extends Conta implements Sacavel{
	
	public ContaPoupanca(int nro,String titular,double saldo){
		this.nroConta = nro;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	//reescrevendo o metodo para sacar
	public  double processarSaque(double quantia){
		if(this.saldo<1000)
		{
			this.saldo = saldo -(quantia+1);
			return saldo;
		}
		else
			this.saldo = saldo -quantia;
			return saldo;
	}

}
