package br.com.lh.operacoes;

/**
 * Utiliza-se classes abstratas para heran�a
 * 
 * @author LH26
 *
 */
public abstract class Math {

	private double a;
	private double b;

	/**
	 * Construtor padr�o
	 */
	public Math() {
	}

	public Math(double x, double y) {
		this.a = x;
		this.b = y;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

}
