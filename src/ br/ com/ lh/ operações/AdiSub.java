package br.com.lh.operacoes;

public class AdiSub extends Math implements Calc {

	private int oper;

	@Override
	public Double calculo(double a, double b) {

		super.setA(a);
		super.setB(b);

		if (this.oper == 1) {
			return super.getA() + super.getB();
		} else if (this.oper == 2) {
			return super.getA() - super.getB();
		} else {
			return null;
		}

	}

	public void mostrar() {
		if (Calculo(super.getA(), super.getB()) == null) {
			System.out.println("Ih, Errou cara!");
		}
		else {
			System.out.println(Calculo(super.getA(), super.getB()));
		}

	}

	public int getOper() {
		return oper;
	}

	public void setOper(int oper) {
		this.oper = oper;
	}

}
