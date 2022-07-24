public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	public static int getTotal() {
		return Conta.total;
	}
	
	public Conta(int agencia, int numero) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("Criando uma conta");
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void deposita(double valor) {
		this.saldo += valor; 
		
		System.out.println("\nDepositado R$ " + valor + " na conta de " + this.getTitular().getNome() + "!"); 
		
		this.exibeSaldo();
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("\nSacado R$ " + valor + " da conta de " + this.getTitular().getNome() + "!"); 
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
			System.out.println("\nTranferido R$ " + valor + " de " + this.getTitular().getNome() + " para " + contaDestino.getTitular().getNome());
			
			this.exibeSaldo();
			contaDestino.exibeSaldo();
			
			return true;
		}
		return false;
	}
	
	void exibeSaldo() {
		System.out.println("\nO saldo de " + this.getTitular().getNome() + " é de R$ " + this.saldo);
	}
}
