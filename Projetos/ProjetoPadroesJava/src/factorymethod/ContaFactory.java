package factorymethod;

public class ContaFactory {

	public static ContaIF criarConta(String conta) {
		
		if(conta == "" || conta == null) {
			return null;
		}
		
		if(conta.equalsIgnoreCase("POUPANÇA")){
			return new Poupanca();
			
		} else if(conta.equalsIgnoreCase("CORRENTE")) {
			return new Corrente();
		}
		
		return null;
	}
}
