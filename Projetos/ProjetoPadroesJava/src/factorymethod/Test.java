package factorymethod;

public class Test {

	public static void main(String[] args) {
		
		ContaFactory tipoConta = new ContaFactory();
		
		ContaIF conta1 = tipoConta.criarConta("poupan�a");
		
		System.out.println("Aqui consta uma conta: " + conta1.getDescricao());
		
	}

}
