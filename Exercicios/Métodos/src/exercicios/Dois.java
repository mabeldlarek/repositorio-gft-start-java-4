package exercicios;

public class Dois {
	private int areaQuadrilatero;
	
	public Dois() {
		this.areaQuadrilatero = 0;
	}

	public void calcularArea(int lado){
		areaQuadrilatero= lado * lado;
		System.out.println("A area é: " + areaQuadrilatero + "\n");
	}
	
	public void calcularArea(int lado, int base){
		areaQuadrilatero= lado * base;
		System.out.println("A area é: " + areaQuadrilatero + "\n");
	}
	
	public void calcularArea(int baseMaior, int baseMenor, int altura){
		areaQuadrilatero= ((baseMaior + baseMenor) * altura) / 2;
		System.out.println("A area é: " + areaQuadrilatero + "\n");
	}
	
}
