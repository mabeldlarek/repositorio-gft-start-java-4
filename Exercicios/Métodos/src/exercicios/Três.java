package exercicios;

public class Tr�s {
	private int areaQuadrilatero;
	
	public Tr�s() {
		this.areaQuadrilatero = 0;
	}

	public int calcularArea(int lado){
		areaQuadrilatero= lado * lado;
		return areaQuadrilatero;
	}
	
	public int calcularArea(int lado, int base){
		areaQuadrilatero= lado * base;
		return areaQuadrilatero;
	}
	
	public int calcularArea(int baseMaior, int baseMenor, int altura){
		areaQuadrilatero= ((baseMaior + baseMenor) * altura) / 2;
		return areaQuadrilatero;
	}
}
