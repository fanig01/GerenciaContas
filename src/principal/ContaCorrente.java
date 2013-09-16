package principal;

public class ContaCorrente extends Conta implements Sacavel {
	
	public ContaCorrente(int nro,String titular,double saldo){
		this.nroConta = nro;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	
	public  double processarSaque(double quantia){
		if(this.saldo<1000)
		{
			this.saldo = saldo -(quantia+0.15);
			return saldo;
		}
		else
			this.saldo = saldo -quantia;
			return saldo;
	}
	
	

}
