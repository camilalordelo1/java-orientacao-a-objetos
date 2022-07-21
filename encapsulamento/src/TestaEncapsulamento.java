
public class TestaEncapsulamento {
	
	public static void main(String[] args) {
		Conta contaDaCamila = new Conta();
		Cliente camila = new Cliente();
		
		contaDaCamila.setTitular(camila);
		
		contaDaCamila.getTitular().setNome("Camila");
		
		System.out.println("Titular da conta: " + contaDaCamila.getTitular().getNome());
		
		contaDaCamila.setSaldo(1000);
		
		contaDaCamila.exibeSaldo();
		
		contaDaCamila.saca(100);
	}
}
