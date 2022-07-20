public class CriaConta {

	public static void main(String[] args) {
		
		Conta contaDaCamila = new Conta();
		contaDaCamila.titular = new Cliente();
		contaDaCamila.titular.nome = "Camila";
		contaDaCamila.saldo = 100;
		
		Conta contaDaMaria = new Conta();
		contaDaMaria.titular = new Cliente();
		contaDaMaria.titular.nome = "Maria";
		contaDaMaria.saldo = 400;
		
		contaDaCamila.deposita(150);
		
		contaDaCamila.saca(50);
		
		contaDaMaria.transfere(200, contaDaCamila);

	}

}
