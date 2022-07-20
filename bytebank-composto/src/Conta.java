public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void deposita(double valor) {
		this.saldo += valor; 
		
		System.out.println("\nDepositado R$ " + valor + " na conta de " + this.titular.nome + "!"); 
		
		this.exibeSaldo();
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("\nSacado R$ " + valor + " da conta de " + this.titular.nome + "!"); 
			this.exibeSaldo();
			
			return true;
		} else {
			System.out.println("\nSem saldo :(");
			this.exibeSaldo();
			
			return false;
		}
		
	}
	
	public boolean transfere(double valor, Conta contaDestino) {
		if(this.saldo >= valor){
			this.saldo -= valor;
			contaDestino.deposita(valor);
			System.out.println("\nTranferido R$ " + valor + " de " + this.titular.nome + " para " + contaDestino.titular.nome);
			
			this.exibeSaldo();
			contaDestino.exibeSaldo();
			
			return true;
		}
		return false;
	}
	
	void exibeSaldo() {
		System.out.println("O saldo de " + this.titular.nome + " é de R$ " + this.saldo);
	}
}
