package br.com.lh.operacoes;

public class MultDiv extends Math implements Calc {

	private int oper;

	@Override
	public Double Calculo(double a, double b) {
		super.setA(a);
		super.setB(b);
		if (this.oper == 3)
			return super.getA() * super.getB();
		else if (this.oper == 4) {
			if (super.getB() == 0)
				return null;
			else
				return super.getA() / super.getB();
		} else
			return null;
	}

	public void Mostrar() {
		if (Calculo(super.getA(), super.getB()) == null)
			System.out.println("Ih , errou cara!");
		else
			System.out.println(Calculo(super.getA(), super.getB()));

	}

	public int getOper() {
		return oper;
	}

	public void setOper(int oper) {
		this.oper = oper;
	}
}
