package br.com.lh.calc;

import java.util.Scanner;

import br.com.lh.operacoes.AdiSub;
import br.com.lh.operacoes.MultDiv;

public class Calculadora {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		int op;
		String Continuar;
		// Math cal= new Math();

		Continuar = "S";
		while (!Continuar.equals("N")) {
			System.out.println("Digite a operação:");
			op = sc2.nextInt();
			if (op == 1 || op == 2) {
				AdiSub ss = new AdiSub();
				ss.setOper(op);
				System.out.println("Digite o numero 1");
				ss.setA(sc1.nextDouble());

				System.out.println("Digite o numero 2 ");
				ss.setB(sc1.nextDouble());

				ss.mostrar();
			} else if (op == 3 || op == 4) {
				MultDiv ss = new MultDiv();
				ss.setOper(op);
				System.out.println("Digite o numero 1");
				ss.setA(sc1.nextDouble());

				System.out.println("Digite o numero 2 ");
				ss.setB(sc1.nextDouble());

				ss.mostrar();

			}

			System.out.println("Deseja Continuar: S / N");
			Continuar = sc3.next().toUpperCase();

		}
		System.out.println("Fim");
		
		sc1.close();
		sc2.close();
		sc3.close();
	}
}
