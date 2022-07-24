
public class TestaEncapsulamento {
	
	public static void main(String[] args) {
		Conta contaDaCamila = new Conta(0001,12345);
		Cliente camila = new Cliente();
		
		contaDaCamila.setTitular(camila);
		
		contaDaCamila.getTitular().setNome("Camila");
		
		System.out.println("Titular da conta: " + contaDaCamila.getTitular().getNome());
		
		contaDaCamila.setSaldo(1000);
		
		contaDaCamila.exibeSaldo();
		
		contaDaCamila.saca(100);
		
		System.out.println("O total de contas: " + Conta.getTotal());
	}
}
